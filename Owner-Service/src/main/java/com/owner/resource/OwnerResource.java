package com.owner.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.owner.model.GuestList;
import com.owner.model.Owner;
import com.owner.model.ReservationList;
import com.owner.model.RoomList;
import com.owner.model.StaffList;
import com.owner.service.OwnerService;




@RestController
//@Api( tags = "Owners")
@CrossOrigin(origins="*")

public class OwnerResource {
	@Autowired
	private RestTemplate restTemplate;
	/*
	 * @Autowired UserRepository userrepo;
	 */
	/*
	 * @Autowired AuthenticationManager authenticates;
	 */
	/*
	 * @Autowired UserService userservice;
	 */
	/*
	 * @Autowired JwtUtil jwtutil;
	 */
	
	/*
	 * @Autowired private AuthenticationManager authenticationManager;
	 */
	
//	@Autowired
//	private MyUserDetailsService userDetailsService;
	/*
	 * @Autowired private JwtUtil jwtTokenUtil;
	 */
	
	@Autowired
	OwnerService service;
	//@ApiOperation(value = "This method is used to get the owner.")
	@GetMapping("/showowner")
	public String test() {
		return "Hello owner";
	} 
	
	
	
	
	
	@RequestMapping(method=RequestMethod.POST, value="/addowner")
	public void addOwner(@RequestBody Owner owner)
	{
		service.addOwner(owner);
	}
	
	
	@GetMapping("/owner")
	public List<Owner> findAllowner() {
		return service.getOwnerInfos();
	}

	
	@GetMapping("/findAllRoom")
	public RoomList getRoom() {
		return restTemplate.getForObject("http://localhost:8084/findAllRoom/", RoomList.class);
	}
	@GetMapping("/getAllEmp")
	public StaffList getAllEmployee() {
		return restTemplate.getForObject("http://localhost:8081/getAllEmp/", StaffList.class);
	}

	@GetMapping("/manager")
	public List<Object> findAllMangers() {
	 Object[] ManagerInformation= restTemplate.getForObject("http://localhost:8081/Manager/manager/", Object[]. class);
	return Arrays.asList(ManagerInformation);
	}
	@GetMapping("/showinventory")
	public List<Object> getAllInventory(){
	Object[] inventory= restTemplate.getForObject("http://localhost:8081/api/showinventory/", Object[].class);
	return Arrays.asList(inventory);
	}
   @GetMapping("/receptionist")
	public List<Object> findAllreceptionist() {
		Object[] ReceptionistInformation= restTemplate.getForObject("http://localhost:8082/Receptionist/receptionist/",Object[].class);
	return Arrays.asList(ReceptionistInformation);
   }

	@GetMapping("/ShowAllReservations")
	public ReservationList getResList() {
		ReservationList list = new ReservationList();
		//list.setResList(this.service.getResList());
		return restTemplate.getForObject("http://localhost:8082/reservation/ShowAllReservations",ReservationList.class);
	}
	
	@GetMapping("getAllGuest")
	public GuestList getAllGuest() {
		GuestList list = new GuestList();
		//list.setAllGuest(this.guestService.getAllGuest());
		return restTemplate.getForObject("http://localhost:8082/getAllGuest/",GuestList.class );
	}
	
//	@RequestMapping(value= "/authenticate", method = RequestMethod.POST)
//	
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
//	try {
//		authenticationManager.authenticate(
//				new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
//	}catch (BadCredentialsException e) {
//			throw new Exception("Incorrect username or password",e);
//		}
//	final UserDetails userDetails=userDetailsService
//			.loadUserByUsername(authenticationRequest.getUsername());
//	final String jwt=jwtTokenUtil.generateToken(userDetails);
//	return ResponseEntity.ok(new AuthenticationResponse(jwt));
//	
//	}
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new 	WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/").allowedHeaders("*").allowedOrigins("*").allowCredentials(true);
//			}
//		};
//	}
	/*
	 * @PostMapping("/subs") public ResponseEntity<?> subscribeClient(@RequestBody
	 * AuthenticationRequest authreq) { String username=authreq.getUsername();
	 * String password=authreq.getPassword();
	 * 
	 * UserModel usermodel =new UserModel();
	 * usermodel.setUsername(authreq.getUsername());
	 * usermodel.setPassword(authreq.getPassword());
	 * 
	 * try { userrepo.save(usermodel); } catch(Exception e) { return
	 * ResponseEntity.ok("Error during subscription"); }
	 * 
	 * 
	 * 
	 * return ResponseEntity.ok("Successfully subcribed "+username); }
	 * 
	 * 
	 * 
	 * @PostMapping("/auth") public ResponseEntity<?>
	 * authenticateClient(@RequestBody AuthenticationRequest authenticationRequest)
	 * {
	 * 
	 * String username=authenticationRequest.getUsername(); String
	 * password=authenticationRequest.getPassword();
	 * 
	 * try { authenticates.authenticate(new
	 * UsernamePasswordAuthenticationToken(username,password)); } catch(Exception e)
	 * { return ResponseEntity.ok("Error during authentication"); }
	 * 
	 * 
	 * 
	 * UserDetails userdetails= userservice.loadUserByUsername(username);
	 * 
	 * 
	 * 
	 * String generatedToken=jwtutil.generateToken(userdetails);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * return ResponseEntity.ok(generatedToken ); //return ResponseEntity.ok(new
	 * AuthenticationResponse("Successfully subcribed "+username));
	 * 
	 * 
	 * 
	 * }
	 */


	@GetMapping("/test")
	private String testingtoken() {
	try {
	return "Testing Successful...!";
	}
	catch(Exception e) {
	return "Please login first..!";
	}
	}

	@GetMapping("/dashboard")
	private String dashboard() {
	return "Welcome to dashboard...!";
	}

	}



	
	
	
	
	
	
	
	



