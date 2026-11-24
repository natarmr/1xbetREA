package a;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class f9x0 {
    public static f9x0 a(v7x0 v7x0Var, Provider provider) throws GeneralSecurityException {
        f9x0 f9x0Var = new f9x0();
        if (!esw0.d(1)) {
            hny.o("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            v7x0Var.c.b();
            new SecretKeySpec(((icw0) v7x0Var.b.b).b(), "AES");
            return f9x0Var;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
