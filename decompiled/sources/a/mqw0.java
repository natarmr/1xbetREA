package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mqw0 {
    static {
        int i = qgx0.f28709a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        n6x0 n6x0Var = n6x0.b;
        n6x0Var.b(rqw0.b);
        n6x0Var.c(rqw0.c);
        r8x0.a();
        int i = wqw0.e;
        if (!esw0.a(i)) {
            hny.o("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        k6x0 k6x0Var = k6x0.b;
        k6x0Var.f(ruw0.f31145a);
        k6x0Var.e(ruw0.b);
        k6x0Var.d(ruw0.c);
        k6x0Var.c(ruw0.d);
        n6x0Var.c(wqw0.f39613a);
        i6x0 i6x0Var = i6x0.b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", ysw0.e);
        zcw0 zcw0VarB = brw0.b();
        zcw0VarB.d(16);
        zcw0VarB.f(32);
        zcw0VarB.m(16);
        zcw0VarB.j(16);
        fhn fhnVar = fhn.g;
        zcw0VarB.e = fhnVar;
        arw0 arw0Var = arw0.e;
        zcw0VarB.f = arw0Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", zcw0VarB.a());
        map.put("AES256_CTR_HMAC_SHA256", ysw0.f);
        zcw0 zcw0VarB2 = brw0.b();
        zcw0VarB2.d(32);
        zcw0VarB2.f(32);
        zcw0VarB2.m(32);
        zcw0VarB2.j(16);
        zcw0VarB2.e = fhnVar;
        zcw0VarB2.f = arw0Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", zcw0VarB2.a());
        i6x0Var.b(Collections.unmodifiableMap(map));
        e6x0 e6x0Var = e6x0.b;
        e6x0Var.a(wqw0.c, brw0.class);
        b6x0 b6x0Var = b6x0.b;
        b6x0Var.a(wqw0.d, brw0.class);
        a5x0 a5x0Var = a5x0.d;
        a5x0Var.b(wqw0.b, i, true);
        int i2 = lrw0.e;
        if (!esw0.a(i2)) {
            hny.o("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        k6x0Var.f(pvw0.f27682a);
        k6x0Var.e(pvw0.b);
        k6x0Var.d(pvw0.c);
        k6x0Var.c(pvw0.d);
        n6x0Var.c(lrw0.f20551a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", ysw0.f43190a);
        h0q0 h0q0VarB = mrw0.b();
        h0q0VarB.G();
        h0q0VarB.I(16);
        h0q0VarB.K();
        p50 p50Var = p50.k;
        h0q0VarB.d = p50Var;
        map2.put("AES128_GCM_RAW", h0q0VarB.D());
        map2.put("AES256_GCM", ysw0.b);
        h0q0 h0q0VarB2 = mrw0.b();
        h0q0VarB2.G();
        h0q0VarB2.I(32);
        h0q0VarB2.K();
        h0q0VarB2.d = p50Var;
        map2.put("AES256_GCM_RAW", h0q0VarB2.D());
        i6x0Var.b(Collections.unmodifiableMap(map2));
        e6x0Var.a(lrw0.c, mrw0.class);
        b6x0Var.a(lrw0.d, mrw0.class);
        a5x0Var.b(lrw0.b, i2, true);
        if (pyw0.a()) {
            return;
        }
        h7x0 h7x0Var = irw0.f15278a;
        if (!esw0.d(1)) {
            hny.o("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(dvw0.f6766a);
        k6x0Var.e(dvw0.b);
        k6x0Var.d(dvw0.c);
        k6x0Var.c(dvw0.d);
        n6x0Var.c(irw0.f15278a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", ysw0.c);
        fht0 fht0VarB = jrw0.b();
        fht0VarB.u(16);
        fht0VarB.x(16);
        fht0VarB.A();
        drq drqVar = drq.g;
        fht0VarB.d = drqVar;
        map3.put("AES128_EAX_RAW", fht0VarB.r());
        map3.put("AES256_EAX", ysw0.d);
        fht0 fht0VarB2 = jrw0.b();
        fht0VarB2.u(16);
        fht0VarB2.x(32);
        fht0VarB2.A();
        fht0VarB2.d = drqVar;
        map3.put("AES256_EAX_RAW", fht0VarB2.r());
        i6x0Var.b(Collections.unmodifiableMap(map3));
        b6x0Var.a(irw0.c, jrw0.class);
        a5x0Var.c(irw0.b, true);
        h7x0 h7x0Var2 = prw0.f27487a;
        if (!esw0.d(1)) {
            hny.o("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(fww0.f10281a);
        k6x0Var.e(fww0.b);
        k6x0Var.d(fww0.c);
        k6x0Var.c(fww0.d);
        HashMap map4 = new HashMap();
        okt0 okt0VarB = srw0.b();
        okt0VarB.p(16);
        m60 m60Var = m60.h;
        okt0VarB.b = m60Var;
        map4.put("AES128_GCM_SIV", okt0VarB.m());
        okt0 okt0VarB2 = srw0.b();
        okt0VarB2.p(16);
        m60 m60Var2 = m60.j;
        okt0VarB2.b = m60Var2;
        map4.put("AES128_GCM_SIV_RAW", okt0VarB2.m());
        okt0 okt0VarB3 = srw0.b();
        okt0VarB3.p(32);
        okt0VarB3.b = m60Var;
        map4.put("AES256_GCM_SIV", okt0VarB3.m());
        okt0 okt0VarB4 = srw0.b();
        okt0VarB4.p(32);
        okt0VarB4.b = m60Var2;
        map4.put("AES256_GCM_SIV_RAW", okt0VarB4.m());
        i6x0Var.b(Collections.unmodifiableMap(map4));
        e6x0Var.a(prw0.c, srw0.class);
        b6x0Var.a(prw0.b, srw0.class);
        n6x0Var.c(prw0.f27487a);
        a5x0Var.c(prw0.d, true);
        h7x0 h7x0Var3 = urw0.f36182a;
        if (!esw0.d(1)) {
            hny.o("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(rww0.f31235a);
        k6x0Var.e(rww0.b);
        k6x0Var.d(rww0.c);
        k6x0Var.c(rww0.d);
        n6x0Var.c(urw0.f36182a);
        b6x0Var.a(urw0.b, vrw0.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new vrw0(y60.k));
        map5.put("CHACHA20_POLY1305_RAW", new vrw0(y60.m));
        i6x0Var.b(Collections.unmodifiableMap(map5));
        a5x0Var.c(urw0.c, true);
        h7x0 h7x0Var4 = bsw0.f3154a;
        if (!esw0.d(1)) {
            hny.o("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(psw0.f27535a);
        k6x0Var.e(psw0.b);
        k6x0Var.d(psw0.c);
        k6x0Var.c(psw0.d);
        n6x0Var.c(bsw0.f3154a);
        b6x0Var.a(bsw0.c, msw0.class);
        a5x0Var.c(bsw0.b, true);
        l5x0 l5x0Var = gsw0.f11852a;
        if (!esw0.d(1)) {
            hny.o("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(wsw0.f39712a);
        k6x0Var.e(wsw0.b);
        k6x0Var.d(wsw0.c);
        k6x0Var.c(wsw0.d);
        b6x0Var.a(gsw0.b, tsw0.class);
        n6x0Var.c(gsw0.c);
        a5x0Var.c(gsw0.f11852a, true);
        h7x0 h7x0Var5 = guw0.f11951a;
        if (!esw0.d(1)) {
            hny.o("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        k6x0Var.f(ayw0.f1690a);
        k6x0Var.e(ayw0.b);
        k6x0Var.d(ayw0.c);
        k6x0Var.c(ayw0.d);
        n6x0Var.c(guw0.f11951a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new muw0(fhn.j));
        map6.put("XCHACHA20_POLY1305_RAW", new muw0(fhn.l));
        i6x0Var.b(Collections.unmodifiableMap(map6));
        b6x0Var.a(guw0.d, muw0.class);
        e6x0Var.a(guw0.c, muw0.class);
        a5x0Var.c(guw0.b, true);
        k6x0Var.f(yxw0.f43442a);
        k6x0Var.e(yxw0.b);
        k6x0Var.d(yxw0.c);
        k6x0Var.c(yxw0.d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", ysw0.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", ysw0.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", ysw0.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", ysw0.j);
        i6x0Var.b(Collections.unmodifiableMap(map7));
        n6x0Var.c(wtw0.b);
        b6x0Var.a(wtw0.f39764a, xtw0.class);
    }
}
