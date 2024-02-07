package www.spring.com.party.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import www.spring.com.party.mapper.PartyMapper;
import www.spring.com.party.model.PartyVO;
import www.spring.com.security.model.CustomUser;

public class CustomUserDetailService implements UserDetailsService {
	@Autowired
	private PartyMapper partyMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		PartyVO partyVO = partyMapper.getParty(username);
		return partyVO == null ? null : new CustomUser(partyVO);
	}

}
