package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rs2 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rs2 f31014a;
    private static final ugi0 descriptor;

    static {
        rs2 rs2Var = new rs2();
        f31014a = rs2Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.AnalyticsEventRequestData", rs2Var, 2);
        zna0Var.j("attributes", true);
        zna0Var.j(Payload.TYPE, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ss2.f32706a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        us2 us2Var = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                us2Var = (us2) bldVarA.e(ugi0Var, 0, ss2.f32706a, us2Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xs2(i, us2Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xs2 xs2Var = (xs2) obj;
        xs2Var.getClass();
        String str = xs2Var.b;
        us2 us2Var = xs2Var.f41393a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || us2Var != null) {
            cldVarA.p(ugi0Var, 0, ss2.f32706a, us2Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
