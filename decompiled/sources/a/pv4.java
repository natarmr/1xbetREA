package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pv4 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pv4 f27646a;
    private static final ugi0 descriptor;

    static {
        pv4 pv4Var = new pv4();
        f27646a = pv4Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.core.data.models.response.AutoBetCancelResponse", pv4Var, 4);
        zna0Var.j("Id", true);
        zna0Var.j("result", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a), mrv.j0(aw4.f1555a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        yv4 yv4Var = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                yv4Var = (yv4) bldVarA.e(ugi0Var, 2, aw4.f1555a, yv4Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new tv4(i, str, l, yv4Var, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tv4 tv4Var = (tv4) obj;
        tv4Var.getClass();
        Integer num = tv4Var.d;
        yv4 yv4Var = tv4Var.c;
        Long l = tv4Var.b;
        String str = tv4Var.f34581a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || yv4Var != null) {
            cldVarA.p(ugi0Var, 2, aw4.f1555a, yv4Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
