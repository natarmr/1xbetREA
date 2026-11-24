package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class czw0 {
    static {
        int i = qgx0.f28709a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        n6x0 n6x0Var = n6x0.b;
        n6x0Var.b(rqw0.d);
        n6x0Var.c(rqw0.e);
        if (pyw0.a()) {
            return;
        }
        h7x0 h7x0Var = yyw0.f43489a;
        if (!esw0.d(1)) {
            hny.o("Registering AES SIV is not supported in FIPS mode");
            return;
        }
        y6x0 y6x0Var = hzw0.f13923a;
        k6x0 k6x0Var = k6x0.b;
        k6x0Var.f(hzw0.f13923a);
        k6x0Var.e(hzw0.b);
        k6x0Var.d(hzw0.c);
        k6x0Var.c(hzw0.d);
        n6x0Var.c(yyw0.f43489a);
        i6x0 i6x0Var = i6x0.b;
        HashMap map = new HashMap();
        map.put("AES256_SIV", fzw0.f10432a);
        hcp0 hcp0VarB = zyw0.b();
        hcp0VarB.y(64);
        hcp0VarB.c = drq.j;
        map.put("AES256_SIV_RAW", hcp0VarB.x());
        i6x0Var.b(Collections.unmodifiableMap(map));
        e6x0.b.a(yyw0.c, zyw0.class);
        b6x0.b.a(yyw0.d, zyw0.class);
        a5x0.d.c(yyw0.b, true);
    }
}
