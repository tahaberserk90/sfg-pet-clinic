package com.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.model.Specialty;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.model.Visit;
import com.springframework.sfgpetclinic.service.OwnerService;
import com.springframework.sfgpetclinic.service.PetTypeService;
import com.springframework.sfgpetclinic.service.SpecialtyService;
import com.springframework.sfgpetclinic.service.VetService;
import com.springframework.sfgpetclinic.service.VisitService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
	private final VisitService visitService;

	public DataLoader(OwnerService ownerService, VetService vetService,
			PetTypeService petTypeService,SpecialtyService specialtyService,
			VisitService visitService) {
		this.visitService = visitService;
		this.specialtyService = specialtyService;
		this.petTypeService = petTypeService;
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }
	}

	private void loadData() {
		PetType kalb = new PetType();
		kalb.setName("kalb");
		PetType savedKalb = petTypeService.save(kalb);

		PetType katous = new PetType();
		kalb.setName("katous");
		PetType savedkatous = petTypeService.save(katous);

		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = specialtyService.save(radiology);

		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty savedSurgery = specialtyService.save(surgery);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("147 rue aplpha");
		owner1.setCity("omeha");
		owner1.setTelephone("113346");

		Pet pet = new Pet();
		pet.setBirthdate(LocalDate.now());
		pet.setPetType(savedKalb);
		pet.setName("rex");
		pet.setOwner(owner1);

		owner1.getPets().add(pet);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("147 rue aplpha");
		owner2.setCity("omeha");
		owner2.setTelephone("113346");
		Pet pet2 = new Pet();
		pet2.setBirthdate(LocalDate.now());
		pet2.setPetType(savedkatous);
		pet2.setName("bagira");
		pet2.setOwner(owner2);

		owner2.getPets().add(pet2);
		ownerService.save(owner2);
		
		Visit catVisit = new Visit();
        catVisit.setPet(pet2);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

		System.out.println("Loaded Owners....");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialties().add(savedRadiology);
		

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialties().add(savedSurgery);

		vetService.save(vet2);

		System.out.println("Loaded Vets....");
	}

}
