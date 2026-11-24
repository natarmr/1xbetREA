package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wsj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wsj0 f39696a;
    private static final ugi0 descriptor;

    static {
        wsj0 wsj0Var = new wsj0();
        f39696a = wsj0Var;
        zna0 zna0Var = new zna0("org.xplatform.promo.impl.promocodes.data.models.ShowcasePromoBuyDataResponse", wsj0Var, 8);
        zna0Var.j("pointsBalance", true);
        zna0Var.j("promoCode", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("gameId", true);
        zna0Var.j("sportId", true);
        zna0Var.j(CrashHianalyticsData.MESSAGE, true);
        zna0Var.j("freebetSumEur", true);
        zna0Var.j("FIF", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(tbl.f33669a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        String str2 = null;
        Double d = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    break;
                case 6:
                    d = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ysj0(i, num, str, num2, l, num3, str2, d, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ysj0 ysj0Var = (ysj0) obj;
        ysj0Var.getClass();
        Boolean bool = ysj0Var.h;
        Double d = ysj0Var.g;
        String str = ysj0Var.f;
        Integer num = ysj0Var.e;
        Long l = ysj0Var.d;
        Integer num2 = ysj0Var.c;
        String str2 = ysj0Var.b;
        Integer num3 = ysj0Var.f43171a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
