package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zeg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zeg0 f44250a;
    private static final ugi0 descriptor;

    static {
        zeg0 zeg0Var = new zeg0();
        f44250a = zeg0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.roulette.RouletteResponse", zeg0Var, 4);
        zna0Var.j("Z", true);
        zna0Var.j("A", true);
        zna0Var.j("N", true);
        zna0Var.j(TokenNames.C, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(nfg0.f23435a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        mfg0 mfg0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                mfg0Var = (mfg0) bldVarA.e(ugi0Var, 0, nfg0.f23435a, mfg0Var);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new bfg0(i, mfg0Var, str, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bfg0 bfg0Var = (bfg0) obj;
        bfg0Var.getClass();
        String str = bfg0Var.d;
        String str2 = bfg0Var.c;
        String str3 = bfg0Var.b;
        mfg0 mfg0Var = bfg0Var.f2501a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || mfg0Var != null) {
            cldVarA.p(ugi0Var, 0, nfg0.f23435a, mfg0Var);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
