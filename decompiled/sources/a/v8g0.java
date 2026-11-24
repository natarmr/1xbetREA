package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v8g0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v8g0 f36981a;
    private static final ugi0 descriptor;

    static {
        v8g0 v8g0Var = new v8g0();
        f36981a = v8g0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.cycling.impl.cycling_player.data.model.ResultsResponse", v8g0Var, 7);
        zna0Var.j("date1", true);
        zna0Var.j("date2", true);
        zna0Var.j("result", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j(CrashHianalyticsData.TIME, true);
        zna0Var.j("title", true);
        zna0Var.j("veloJerseys", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = z8g0.h;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[6].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = z8g0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new z8g0(i, l, l2, num, num2, str, str2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z8g0 z8g0Var = (z8g0) obj;
        z8g0Var.getClass();
        List list = z8g0Var.g;
        String str = z8g0Var.f;
        String str2 = z8g0Var.e;
        Integer num = z8g0Var.d;
        Integer num2 = z8g0Var.c;
        Long l = z8g0Var.b;
        Long l2 = z8g0Var.f43965a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = z8g0.h;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
