package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s3h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3h0 f31558a;
    private static final ugi0 descriptor;

    static {
        s3h0 s3h0Var = new s3h0();
        f31558a = s3h0Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.ScoreResponse", s3h0Var, 5);
        zna0Var.j("fullScore", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("timer", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("isBreak", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(gnq0.f11600a), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        qnq0 qnq0Var = null;
        String str3 = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                qnq0Var = (qnq0) bldVarA.e(ugi0Var, 2, gnq0.f11600a, qnq0Var);
                i |= 4;
            } else if (iF == 3) {
                str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new c5h0(i, str, str2, qnq0Var, str3, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c5h0 c5h0Var = (c5h0) obj;
        c5h0Var.getClass();
        Boolean bool = c5h0Var.e;
        String str = c5h0Var.d;
        qnq0 qnq0Var = c5h0Var.c;
        String str2 = c5h0Var.b;
        String str3 = c5h0Var.f3772a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || qnq0Var != null) {
            cldVarA.p(ugi0Var, 2, gnq0.f11600a, qnq0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
