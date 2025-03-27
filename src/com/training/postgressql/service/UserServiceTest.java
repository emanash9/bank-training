package com.training.postgressql.service;

import com.training.postgressql.repository.User;
import com.training.postgressql.repository.UserRepository;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    private UserRepository repository;
    private UserService userService;

    @BeforeEach
    public void setUp() {
        // Mocking UserRepository
        repository = mock(UserRepository.class);

        // Creating instance of UserService with mocked repository
        userService = new UserService(repository);
    }

    @Test
    public void displayUserNameTest() {
        // Arrange: Mock the behavior of getUserById
        int userId = 1;
        User mockUser = new User(userId, "Eman the user");
        when(repository.getUserById(userId)).thenReturn(mockUser);

        // Act: Call the method to test
        String actualUserName = userService.displayUserName(userId);

        // Assert: Verify the result
        assertEquals("Eman the user", actualUserName, "The username should be 'Eman the user'");
    }
}
