package request;

import javax.persistence.ManyToOne;

import com.HoangTy.motel.table.Address;
import com.HoangTy.motel.table.Manager;

import lombok.Data;
@Data
public class InsertMotel {
	private Long id;
	private String name;
	private Long manager;
	private Long address;

}
