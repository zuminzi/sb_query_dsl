package com.ll.exam.qsl.user.repository;

import com.ll.exam.qsl.interestkeyword.entity.InterestKeyword;
import com.ll.exam.qsl.user.entity.SiteUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserRepositoryCustom {
    SiteUser getQslUser(Long id);
    long getQslCount();
    SiteUser getQslUserOrderByIdAscOne();
    List<SiteUser> getQslUsersOrderByIdAsc();
    List<SiteUser> searchQsl(String kw);
    Page<SiteUser> searchQsl(String kw, Pageable pageable);
    List<SiteUser> getQslUsersByInterestKeyword(String kw);
    List<InterestKeyword> getFollowingsInterestKeywords(SiteUser u1);
}
