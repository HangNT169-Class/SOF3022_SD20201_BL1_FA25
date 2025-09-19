package com.sof3022.sd20201.B2_LamViecVoiForm.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {

    // liet ke cac yeu cau can gui di
    // BAT BUOC: TEN TRONG CLASS REQUEST TEN TRONG NAME TRONG INPUT
    private String uname;

    private String pass;

}
