package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class k8x0 implements w6x0, g5x0 {
    @Override // a.g5x0
    public vkr0 a(atm0 atm0Var) {
        h8x0 h8x0Var = (h8x0) atm0Var;
        jdx0 jdx0VarY = ldx0.y();
        p8x0 p8x0Var = h8x0Var.f12651a;
        udx0 udx0VarX = wdx0.x();
        int i = p8x0Var.b;
        udx0VarX.d();
        ((wdx0) udx0VarX.b).zzf = i;
        mdx0 mdx0Var = (mdx0) g9x0.f10938a.n(p8x0Var.d);
        udx0VarX.d();
        ((wdx0) udx0VarX.b).zze = mdx0Var.zza();
        wdx0 wdx0Var = (wdx0) udx0VarX.c();
        jdx0VarY.d();
        ldx0.x((ldx0) jdx0VarY.b, wdx0Var);
        byte[] bArrB = ((icw0) h8x0Var.b.b).b();
        vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
        jdx0VarY.d();
        ldx0.w((ldx0) jdx0VarY.b, vjw0VarH);
        return vkr0.C("type.googleapis.com/google.crypto.tink.HmacKey", ((ldx0) jdx0VarY.c()).a(), hbb.j, g9x0.a(h8x0Var.f12651a.c), h8x0Var.d);
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        String str = (String) x4w0Var.b;
        if (!str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            jf4.o(kng0.k("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            aax0 aax0VarU = aax0.u((sjw0) x4w0Var.f40287a, dkw0.b);
            x4w0 x4w0VarB = g8x0.b();
            x4w0VarB.f(aax0VarU.t());
            x4w0VarB.g(aax0VarU.y().t());
            x4w0VarB.c = c9x0.a((lpw0) x4w0Var.c);
            return x4w0VarB.e();
        } catch (qkw0 e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }
}
