/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.users.module.util.code;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author luis
 */
public class StandardCode {

    public static String generatedCode(String entity, Object obj) {
        String code = entity + RandomStringUtils.randomAlphabetic(6).toUpperCase() + obj.toString().toUpperCase();
        return code;
    }
}
