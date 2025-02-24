package com.lshdainty.myhr;

import com.lshdainty.myhr.domain.*;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.initSetMember();
        initService.initSetHoliday();
        initService.initSetRecommend();
        initService.initSetVacation();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;

        public void initSetMember() {
            saveMember("이서준", "19700723", "9 ~ 6", "ADMIN", "N", "N");
            saveMember("김서연", "19701026", "8 ~ 5", "BP", "N", "N");
            saveMember("김지후", "19740115", "10 ~ 7", "BP", "Y", "N");
            saveMember("이준우", "19800430", "9 ~ 6", "BP", "N", "Y");
            saveMember("조민서", "19921220", "9 ~ 6", "ADMIN", "N", "N");
            saveMember("이하은", "18850902", "8 ~ 5", "ADMIN", "N", "N");
        }

        public void initSetHoliday() {
            saveHoliday("신정", "20250101");
            saveHoliday("임시공휴일(설날)", "20250127");
            saveHoliday("설날연휴", "20250128");
            saveHoliday("설날", "20250129");
            saveHoliday("설날연휴", "20250130");
            saveHoliday("삼일절", "20250301");
            saveHoliday("대체공휴일(삼일절)", "20250303");
            saveHoliday("근로자의 날", "20250501");
            saveHoliday("어린이날", "20250505");
            saveHoliday("대체공휴일(석가탄신일)", "20250506");
            saveHoliday("현충일", "20250606");
            saveHoliday("광복절", "20250815");
            saveHoliday("개천절", "20251003");
            saveHoliday("추석연휴", "20251005");
            saveHoliday("추석", "20251006");
            saveHoliday("추석연휴", "20251007");
            saveHoliday("대체공휴일(추석)", "20251008");
            saveHoliday("한글날", "20251009");
            saveHoliday("크리스마스", "20251225");
        }

        public void initSetRecommend() {
            saveRecommend("권장휴가", "20250131");
            saveRecommend("권장휴가", "20250304");
            saveRecommend("권장휴가", "20250404");
            saveRecommend("권장휴가", "20250502");
            saveRecommend("권장휴가", "20250523");
            saveRecommend("권장휴가", "20250704");
            saveRecommend("권장휴가", "20250814");
            saveRecommend("권장휴가", "20250905");
            saveRecommend("권장휴가", "20251010");
            saveRecommend("권장휴가", "20251114");
        }

        public void initSetVacation() {
            saveVacation(1L, "1분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(2L, "1분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(3L, "1분기 휴가", "작년 하루 사용", VacationType.BASIC, 24f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(4L, "1분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(5L, "1분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(6L, "1분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(1L, "2분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(2L, "2분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(3L, "2분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(4L, "2분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(5L, "2분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(6L, "2분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(1L, "3분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(2L, "3분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(3L, "3분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(4L, "3분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(5L, "3분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(6L, "3분기 휴가", "", VacationType.BASIC, 32.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(1L, "4분기 휴가", "", VacationType.BASIC, 24.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(2L, "4분기 휴가", "", VacationType.BASIC, 24.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(3L, "4분기 휴가", "", VacationType.BASIC, 24.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(4L, "4분기 휴가", "", VacationType.BASIC, 24.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(5L, "4분기 휴가", "", VacationType.BASIC, 24.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
            saveVacation(6L, "4분기 휴가", "", VacationType.BASIC, 24.0f, LocalDateTime.of(2025, 12, 31, 23, 59, 59));
        }

        public void initSetSchedule() {

        }



        public void saveMember(String name, String birth, String workTime, String employ, String lunar, String del) {
            User user = new User();
            user.setName(name);
            user.setBirth(birth);
            user.setWorkTime(workTime);
            user.setEmploy(employ);
            user.setLunarYN(lunar);
            user.setDelYN(del);
            em.persist(user);
        }

        public void saveHoliday(String name, String date) {
            Holiday holiday = new Holiday();
            holiday.setName(name);
            holiday.setDate(date);
            em.persist(holiday);
        }

        public void saveRecommend(String name, String date) {
            Recommend recommend = new Recommend();
            recommend.setName(name);
            recommend.setDate(date);
            em.persist(recommend);
        }

        public void saveVacation(Long userNo, String name, String description, VacationType type, float grantedTime, LocalDateTime expirationDate) {
            Vacation vacation = new Vacation();
            vacation.setUser(em.find(User.class, userNo));
            vacation.setName(name);
            vacation.setDescription(description);
            vacation.setType(type);
            vacation.setGrantedTime(grantedTime);
            vacation.setExpirationDate(expirationDate);
            vacation.setCreateDate(LocalDateTime.now());
            em.persist(vacation);
        }
    }
}
