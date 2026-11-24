package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c8x0 implements c7x0, a7x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3936a;

    public /* synthetic */ c8x0(byte b) {
        this.f3936a = b;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) throws GeneralSecurityException {
        v7x0 v7x0Var = (v7x0) atm0Var;
        if (v7x0Var.f36952a.f10885a == 32) {
            return new acw0(v7x0Var);
        }
        hny.o("AesCmacKey size wrong, must be 32 bytes");
        return null;
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) throws GeneralSecurityException {
        switch (this.f3936a) {
            case 1:
                g8x0 g8x0Var = (g8x0) fpw0Var;
                lpw0 lpw0VarB = c9x0.b(g8x0Var.c);
                z9x0 z9x0VarX = aax0.x();
                cax0 cax0VarV = dax0.v();
                int i = g8x0Var.b;
                cax0VarV.d();
                ((dax0) cax0VarV.b).zze = i;
                dax0 dax0Var = (dax0) cax0VarV.c();
                z9x0VarX.d();
                aax0.w((aax0) z9x0VarX.b, dax0Var);
                int i2 = g8x0Var.f10885a;
                z9x0VarX.d();
                ((aax0) z9x0VarX.b).zzf = i2;
                return x4w0.d("type.googleapis.com/google.crypto.tink.AesCmacKey", lpw0VarB, ((aax0) z9x0VarX.c()).a());
            default:
                p8x0 p8x0Var = (p8x0) fpw0Var;
                lpw0 lpw0VarA = g9x0.a(p8x0Var.c);
                odx0 odx0VarY = qdx0.y();
                udx0 udx0VarX = wdx0.x();
                int i3 = p8x0Var.b;
                udx0VarX.d();
                ((wdx0) udx0VarX.b).zzf = i3;
                mdx0 mdx0Var = (mdx0) g9x0.f10938a.n(p8x0Var.d);
                udx0VarX.d();
                ((wdx0) udx0VarX.b).zze = mdx0Var.zza();
                wdx0 wdx0Var = (wdx0) udx0VarX.c();
                odx0VarY.d();
                qdx0.w((qdx0) odx0VarY.b, wdx0Var);
                int i4 = p8x0Var.f26582a;
                odx0VarY.d();
                ((qdx0) odx0VarY.b).zzg = i4;
                return x4w0.d("type.googleapis.com/google.crypto.tink.HmacKey", lpw0VarA, ((qdx0) odx0VarY.c()).a());
        }
    }
}
