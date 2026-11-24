package a;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d8x0 implements c7x0, g5x0, d5x0 {
    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public vkr0 mo8a(atm0 atm0Var) {
        v7x0 v7x0Var = (v7x0) atm0Var;
        w9x0 w9x0VarX = x9x0.x();
        g8x0 g8x0Var = v7x0Var.f36952a;
        cax0 cax0VarV = dax0.v();
        int i = g8x0Var.b;
        cax0VarV.d();
        ((dax0) cax0VarV.b).zze = i;
        dax0 dax0Var = (dax0) cax0VarV.c();
        w9x0VarX.d();
        x9x0.w((x9x0) w9x0VarX.b, dax0Var);
        byte[] bArrB = ((icw0) v7x0Var.b.b).b();
        vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
        w9x0VarX.d();
        x9x0.v((x9x0) w9x0VarX.b, vjw0VarH);
        return vkr0.C("type.googleapis.com/google.crypto.tink.AesCmacKey", ((x9x0) w9x0VarX.c()).a(), hbb.j, c9x0.b(v7x0Var.f36952a.c), v7x0Var.d);
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            jf4.o("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            ldx0 ldx0VarV = ldx0.v((sjw0) vkr0Var.c, dkw0.b);
            if (ldx0VarV.u() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            h0q0 h0q0VarB = p8x0.b();
            h0q0VarB.f12247a = Integer.valueOf(ldx0VarV.B().e());
            h0q0VarB.b = Integer.valueOf(ldx0VarV.A().t());
            h0q0VarB.c = (o8x0) g9x0.f10938a.o(ldx0VarV.A().w());
            h0q0VarB.d = g9x0.b((lpw0) vkr0Var.e);
            p8x0 p8x0VarF = h0q0VarB.F();
            l8w0 l8w0Var = new l8w0();
            l8w0Var.b = null;
            l8w0Var.c = null;
            l8w0Var.f19624a = p8x0VarF;
            l8w0Var.b = new rkt0(icw0.a(ldx0VarV.B().r()), (byte) 11);
            l8w0Var.c = (Integer) vkr0Var.f;
            return l8w0Var.d();
        } catch (qkw0 | IllegalArgumentException unused) {
            hny.o("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) throws GeneralSecurityException {
        v7x0 v7x0Var = (v7x0) atm0Var;
        if (v7x0Var.f36952a.f10885a == 32) {
            if (esw0.d(1)) {
                Provider providerA0 = hew0.a0();
                if (providerA0 != null) {
                    try {
                        return f9x0.a(v7x0Var, providerA0);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new f9x0();
            }
            hny.o("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        hny.o("AesCmacKey size wrong, must be 32 bytes");
        return null;
    }
}
