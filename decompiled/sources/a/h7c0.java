package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h7c0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h7c0 f12568a;
    private static final ugi0 descriptor;

    static {
        h7c0 h7c0Var = new h7c0();
        f12568a = h7c0Var;
        zna0 zna0Var = new zna0("org.xplatform.promo.impl.promocodes.data.models.PromoBonusDataResponse", h7c0Var, 5);
        zna0Var.j("exceptionId", true);
        zna0Var.j("pointsSum", true);
        zna0Var.j(CrashHianalyticsData.MESSAGE, true);
        zna0Var.j("coinsBalance", true);
        zna0Var.j("coinsLeftDays", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new j7c0(i, num, num2, num3, num4, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j7c0 j7c0Var = (j7c0) obj;
        j7c0Var.getClass();
        Integer num = j7c0Var.e;
        Integer num2 = j7c0Var.d;
        String str = j7c0Var.c;
        Integer num3 = j7c0Var.b;
        Integer num4 = j7c0Var.f16034a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
