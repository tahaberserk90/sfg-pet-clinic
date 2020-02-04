package com.springframework.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.service.OwnerService;
import com.springframework.sfgpetclinic.service.PetService;
import com.springframework.sfgpetclinic.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
	
	private final PetTypeService petTypeService;
	private final PetService petService;
	
	

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		if(object !=null) {
			if(object.getPets()!=null) {
				object.getPets().forEach(pet->{
					if(pet.getPetType()!=null) {
						if(pet.getPetType().getId()==null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("pet type is mandatory");
					}
					if(pet.getId()==null) {
						Pet petSaved=petService.save(pet);
						pet.setId(petSaved.getId());
					}
				});
			}
			return super.save(object);
		}else {
			return null;
		}
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
