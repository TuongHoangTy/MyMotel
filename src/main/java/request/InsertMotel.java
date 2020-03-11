package request;

import javax.persistence.ManyToOne;

import com.HoangTy.motel.table.Address;
import com.HoangTy.motel.table.Manager;

public class InsertMotel {
	private Long id;
	private String name;
	private Manager manager;
	private Address address;

}
