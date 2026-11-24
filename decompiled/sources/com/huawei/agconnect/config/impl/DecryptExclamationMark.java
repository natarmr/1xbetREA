package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.IDecrypt;
import com.huawei.hms.android.HwBuildEx;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class DecryptExclamationMark implements IDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigReader f45680a;
    public SecretKeySpec b;
    public boolean c = false;

    public DecryptExclamationMark(ConfigReader configReader) {
        this.f45680a = configReader;
    }

    public static String a(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    public final String c(String str) {
        String str2;
        if (!this.c) {
            ConfigReader configReader = this.f45680a;
            try {
                this.b = Keys.a(new AesParam(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, configReader.getString("/code/code1", null), configReader.getString("/code/code2", null), configReader.getString("/code/code3", null), configReader.getString("/code/code4", null), "PBKDF2WithHmacSHA1"));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
                this.b = null;
            }
            this.c = true;
        }
        if (this.b == null) {
            str2 = "mKey is null, return default value";
        } else {
            if (!b(str)) {
                return null;
            }
            try {
                return new String(Keys.c(this.b, Hex.a(a(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused2) {
                str2 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str2);
        return null;
    }
}
