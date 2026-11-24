package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kle0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kle0 f18482a;
    private static final ugi0 descriptor;

    static {
        kle0 kle0Var = new kle0();
        f18482a = kle0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.referee.referee_tour.data.models.RefereeTourInfoDataResponse", kle0Var, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new mle0(i, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mle0 mle0Var = (mle0) obj;
        mle0Var.getClass();
        String str = mle0Var.b;
        String str2 = mle0Var.f21986a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
