package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class DecryptLocalResource implements IDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKeySpec f45681a;
    public final AesParam b;
    public boolean c = false;

    public DecryptLocalResource(AesParam aesParam) {
        this.b = aesParam;
    }

    public final String a(String str) {
        String str2;
        if (!this.c) {
            try {
                this.f45681a = Keys.a(this.b);
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e.getMessage());
                this.f45681a = null;
            }
            this.c = true;
        }
        if (this.f45681a == null || TextUtils.isEmpty(str)) {
            str2 = "decrypt exception: secretKey = " + this.f45681a + "raw = " + str;
        } else {
            try {
                return new String(Keys.c(this.f45681a, Hex.a(str)), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e2) {
                str2 = "decrypt exception:" + e2.getMessage();
            }
        }
        Log.e("AGC_LocalResource", str2);
        return null;
    }
}
