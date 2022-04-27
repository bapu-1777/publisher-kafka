package com.example.demo.model;


import lombok.*;

/**
 * This class serving as model to hold data
 * @author Mayank Vekariya
 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class User {

    /**
     * @param Id
     * @param Name
     * @param Email
     */

    String userId;
    String userName;
    String userEmail;



}
