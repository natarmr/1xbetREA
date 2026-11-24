package a;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s6x0 implements a7x0, c7x0, w6x0, lix0 {
    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) throws GeneralSecurityException {
        gfk0 gfk0Var = gfk0.h;
        vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
        o5x0.u(vkr0Var, gfk0Var);
        lpw0 lpw0Var = (lpw0) vkr0Var.e;
        bcm0.D(lpw0Var);
        bcm0.F(lpw0Var, (Integer) vkr0Var.f).b();
        return new m9x0();
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        String str = (String) x4w0Var.b;
        if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            jf4.o(kng0.k("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            qdx0 qdx0VarU = qdx0.u((sjw0) x4w0Var.f40287a, dkw0.b);
            if (qdx0VarU.x() != 0) {
                throw new GeneralSecurityException(twn.m(qdx0VarU.x(), "Parsing HmacParameters failed: unknown Version "));
            }
            h0q0 h0q0VarB = p8x0.b();
            h0q0VarB.f12247a = Integer.valueOf(qdx0VarU.t());
            h0q0VarB.b = Integer.valueOf(qdx0VarU.A().t());
            h0q0VarB.c = (o8x0) g9x0.f10938a.o(qdx0VarU.A().w());
            h0q0VarB.d = g9x0.b((lpw0) x4w0Var.c);
            return h0q0VarB.F();
        } catch (qkw0 e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) {
        return ((t5x0) fpw0Var).f33391a;
    }
}
