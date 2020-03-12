package request;

import com.HoangTy.motel.table.Address;
import com.HoangTy.motel.table.Manager;

import lombok.Data;

@Data
public class MotelReq {
	private Long id;
	private String name;
	private Long ManagerId;
	private Long AddressId;

}
