package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r8x0 {
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
        n6x0Var.b(rqw0.k);
        n6x0Var.c(rqw0.l);
        n6x0Var.b(rqw0.j);
        int i = j8x0.f;
        if (!esw0.a(i)) {
            hny.o("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        okt0 okt0Var = g9x0.f10938a;
        k6x0 k6x0Var = k6x0.b;
        k6x0Var.f(g9x0.b);
        k6x0Var.e(g9x0.c);
        k6x0Var.d(g9x0.d);
        k6x0Var.c(g9x0.e);
        n6x0Var.c(j8x0.f16109a);
        n6x0Var.c(j8x0.b);
        i6x0 i6x0Var = i6x0.b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", w8x0.f38748a);
        h0q0 h0q0VarB = p8x0.b();
        h0q0VarB.f12247a = 32;
        h0q0VarB.b = 16;
        arw0 arw0Var = arw0.k;
        h0q0VarB.d = arw0Var;
        o8x0 o8x0Var = o8x0.d;
        h0q0VarB.c = o8x0Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", h0q0VarB.F());
        h0q0 h0q0VarB2 = p8x0.b();
        h0q0VarB2.f12247a = 32;
        h0q0VarB2.b = 32;
        arw0 arw0Var2 = arw0.h;
        h0q0VarB2.d = arw0Var2;
        h0q0VarB2.c = o8x0Var;
        map.put("HMAC_SHA256_256BITTAG", h0q0VarB2.F());
        h0q0 h0q0VarB3 = p8x0.b();
        h0q0VarB3.f12247a = 32;
        h0q0VarB3.b = 32;
        h0q0VarB3.d = arw0Var;
        h0q0VarB3.c = o8x0Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", h0q0VarB3.F());
        h0q0 h0q0VarB4 = p8x0.b();
        h0q0VarB4.f12247a = 64;
        h0q0VarB4.b = 16;
        h0q0VarB4.d = arw0Var2;
        o8x0 o8x0Var2 = o8x0.f;
        h0q0VarB4.c = o8x0Var2;
        map.put("HMAC_SHA512_128BITTAG", h0q0VarB4.F());
        h0q0 h0q0VarB5 = p8x0.b();
        h0q0VarB5.f12247a = 64;
        h0q0VarB5.b = 16;
        h0q0VarB5.d = arw0Var;
        h0q0VarB5.c = o8x0Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", h0q0VarB5.F());
        h0q0 h0q0VarB6 = p8x0.b();
        h0q0VarB6.f12247a = 64;
        h0q0VarB6.b = 32;
        h0q0VarB6.d = arw0Var2;
        h0q0VarB6.c = o8x0Var2;
        map.put("HMAC_SHA512_256BITTAG", h0q0VarB6.F());
        h0q0 h0q0VarB7 = p8x0.b();
        h0q0VarB7.f12247a = 64;
        h0q0VarB7.b = 32;
        h0q0VarB7.d = arw0Var;
        h0q0VarB7.c = o8x0Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", h0q0VarB7.F());
        map.put("HMAC_SHA512_512BITTAG", w8x0.b);
        h0q0 h0q0VarB8 = p8x0.b();
        h0q0VarB8.f12247a = 64;
        h0q0VarB8.b = 64;
        h0q0VarB8.d = arw0Var;
        h0q0VarB8.c = o8x0Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", h0q0VarB8.F());
        i6x0Var.b(Collections.unmodifiableMap(map));
        b6x0 b6x0Var = b6x0.b;
        b6x0Var.a(j8x0.e, p8x0.class);
        e6x0.b.a(j8x0.d, p8x0.class);
        a5x0 a5x0Var = a5x0.d;
        a5x0Var.b(j8x0.c, i, true);
        if (pyw0.a()) {
            return;
        }
        yqw0 yqw0Var = b8x0.f2180a;
        if (!esw0.d(1)) {
            hny.o("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(c9x0.f3983a);
        k6x0Var.e(c9x0.b);
        k6x0Var.d(c9x0.c);
        k6x0Var.c(c9x0.d);
        b6x0Var.a(b8x0.f2180a, g8x0.class);
        n6x0Var.c(b8x0.b);
        n6x0Var.c(b8x0.c);
        HashMap map2 = new HashMap();
        g8x0 g8x0Var = w8x0.c;
        map2.put("AES_CMAC", g8x0Var);
        map2.put("AES256_CMAC", g8x0Var);
        x4w0 x4w0VarB = g8x0.b();
        x4w0VarB.f(32);
        x4w0VarB.g(16);
        x4w0VarB.c = hbb.s;
        map2.put("AES256_CMAC_RAW", x4w0VarB.e());
        i6x0Var.b(Collections.unmodifiableMap(map2));
        a5x0Var.c(b8x0.d, true);
    }
}
