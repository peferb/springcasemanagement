package se.teknikhogskolan.springcasemanagement.repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.teknikhogskolan.springcasemanagement.model.SecureUser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static se.teknikhogskolan.springcasemanagement.service.SecurityHelper.generateToken;

public final class TestSecurityUserRepository {
    private static final String PROJECT_PACKAGE = "se.teknikhogskolan.springcasemanagement";
    private static SecureUser user;
//
//
//    @BeforeClass
//    public static void masterSetup() {
//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
//            context.scan(PROJECT_PACKAGE);
//            context.refresh();
//
//            user = context.getBean(SecurityUserRepository.class).save(new SecureUser(""));
//        }
//    }
//
//    @AfterClass
//    public static void masterTearDown() {
//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
//            context.scan(PROJECT_PACKAGE);
//            context.refresh();
//            SecurityUserRepository securityUserRepository = context.getBean(SecurityUserRepository.class);
//            securityUserRepository.delete(user.getId());
//        }
//    }
//
//    @Test
//    public void ifUserHasNoTokensEmptyMapIsReturnedNotNull() {
//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
//            context.scan(PROJECT_PACKAGE);
//            context.refresh();
//            SecurityUserRepository securityUserRepository = context.getBean(SecurityUserRepository.class);
//
//            SecureUser noTokensUser = new SecureUser("NoTokes4Life");
//            noTokensUser = securityUserRepository.save(noTokensUser);
//
//            assertNotNull(noTokensUser.getTokensExpiration());
//            assertTrue(Map.class.isAssignableFrom(noTokensUser.getTokensExpiration().getClass()));
//            assertTrue(noTokensUser.getTokensExpiration().isEmpty());
//
//            securityUserRepository.delete(noTokensUser);
//        }
//    }
//
//    @Test
//    public void canGetAndAddTokenAndFindByToken() {
//
//        final SecureUser batman = executeOne(repo -> repo.findByUsername(user.getUsername()));
//
//        String token = generateToken(255);
//        LocalDateTime expireTime = LocalDateTime.now().plusDays(1L);
//        batman.addToken(token, expireTime);
//        SecureUser batmanWithToken = executeOne(repo -> repo.save(batman));
//        assertFalse(batman.getTokensExpiration().isEmpty());
//
//        SecureUser result = executeOne(repo -> repo.findByToken(token));
//        assertEquals(batmanWithToken, result);
//    }
//
//    @Test
//    public void canGetSecurityUser() {
//        Long userIdInDb = user.getId();
//
//        SecureUser result = executeOne(repo -> repo.findOne(userIdInDb));
//
//        assertNotNull(result);
//    }
//
//
//    private void executeVoid(Consumer<SecurityUserRepository> operation) {
//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
//            context.scan(PROJECT_PACKAGE);
//            context.refresh();
//            SecurityUserRepository securityUserRepository = context.getBean(SecurityUserRepository.class);
//            operation.accept(securityUserRepository);
//        }
//    }
//
//    private SecureUser executeOne(Function<SecurityUserRepository, SecureUser> operation) {
//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
//            context.scan(PROJECT_PACKAGE);
//            context.refresh();
//            SecurityUserRepository securityUserRepository = context.getBean(SecurityUserRepository.class);
//            return operation.apply(securityUserRepository);
//        }
//    }
//
//    private Collection<SecureUser> executeMany(Function<SecurityUserRepository, Collection<SecureUser>> operation) {
//        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
//            context.scan(PROJECT_PACKAGE);
//            context.refresh();
//            SecurityUserRepository securityUserRepository = context.getBean(SecurityUserRepository.class);
//            return operation.apply(securityUserRepository);
//        }
//    }
}