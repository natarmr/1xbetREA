package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m8x0 implements c7x0, d5x0 {
    public m8x0(xow0 xow0Var, int i) {
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) {
        return new acw0((h8x0) atm0Var);
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            jf4.o("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            return null;
        }
        try {
            x9x0 x9x0VarU = x9x0.u((sjw0) vkr0Var.c, dkw0.b);
            if (x9x0VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            x4w0 x4w0VarB = g8x0.b();
            x4w0VarB.f(x9x0VarU.z().e());
            x4w0VarB.g(x9x0VarU.y().t());
            x4w0VarB.c = c9x0.a((lpw0) vkr0Var.e);
            g8x0 g8x0VarE = x4w0VarB.e();
            mkt0 mkt0Var = new mkt0();
            mkt0Var.b = null;
            mkt0Var.c = null;
            mkt0Var.f21959a = g8x0VarE;
            mkt0Var.b = new rkt0(icw0.a(x9x0VarU.z().r()), (byte) 11);
            mkt0Var.c = (Integer) vkr0Var.f;
            return mkt0Var.d();
        } catch (qkw0 | IllegalArgumentException unused) {
            hny.o("Parsing AesCmacKey failed");
            return null;
        }
    }
}
