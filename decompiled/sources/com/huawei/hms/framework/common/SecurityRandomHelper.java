package com.huawei.hms.framework.common;

import a.afn0;
import a.jwn;

/* JADX INFO: loaded from: classes2.dex */
public class SecurityRandomHelper {
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        afn0.k("EncryptUtil", "setBouncycastleFlag: true");
                        instance = new SecurityRandomHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i) {
        return jwn.b(i);
    }

    public String generateSecureRandomStr(int i) {
        return jwn.c(i);
    }
}
