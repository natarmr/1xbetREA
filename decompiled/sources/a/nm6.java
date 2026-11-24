package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nm6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nm6 f23758a;
    private static final ugi0 descriptor;

    static {
        nm6 nm6Var = new nm6();
        f23758a = nm6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderVideoResponse", nm6Var, 3);
        zna0Var.j("enabled", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("needStartVideo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bool2 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new pm6(i, bool, bool2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pm6 pm6Var = (pm6) obj;
        pm6Var.getClass();
        Boolean bool = pm6Var.c;
        String str = pm6Var.b;
        Boolean bool2 = pm6Var.f27215a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
