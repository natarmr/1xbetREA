package a;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15231a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static sfx0 a(mfx0 mfx0Var) {
        rfx0 rfx0VarV = sfx0.v();
        int iY = mfx0Var.y();
        rfx0VarV.d();
        ((sfx0) rfx0VarV.b).zze = iY;
        for (jfx0 jfx0Var : mfx0Var.A()) {
            pfx0 pfx0VarX = qfx0.x();
            String strA = jfx0Var.z().A();
            pfx0VarX.d();
            qfx0.u((qfx0) pfx0VarX.b, strA);
            int iA = jfx0Var.A();
            pfx0VarX.d();
            ((qfx0) pfx0VarX.b).zzf = esw0.c(iA);
            int iC = jfx0Var.C();
            pfx0VarX.d();
            ((qfx0) pfx0VarX.b).zzh = esw0.e(iC);
            int iU = jfx0Var.u();
            pfx0VarX.d();
            ((qfx0) pfx0VarX.b).zzg = iU;
            qfx0 qfx0Var = (qfx0) pfx0VarX.c();
            rfx0VarV.d();
            sfx0.u((sfx0) rfx0VarV.b, qfx0Var);
        }
        return (sfx0) rfx0VarV.c();
    }
}
