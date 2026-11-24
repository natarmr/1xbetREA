package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jls implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jls f16732a;
    private static final ugi0 descriptor;

    static {
        jls jlsVar = new jls();
        f16732a = jlsVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.GameLogResponse", jlsVar, 9);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j(CrashHianalyticsData.TIME, true);
        zna0Var.j("isRadiant", true);
        zna0Var.j("heroId", true);
        zna0Var.j("heroName", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("targetId", true);
        zna0Var.j("targetName", true);
        zna0Var.j("targetImageS3", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) lls.j[0].getValue());
        jiy jiyVarJ1 = mrv.j0(s710.f31729a);
        jiy jiyVarJ2 = mrv.j0(sm8.f32432a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lls.j;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        ols olsVar = null;
        Long l = null;
        Boolean bool = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    olsVar = (ols) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), olsVar);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new lls(i, olsVar, l, bool, num, str3, str4, num2, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lls llsVar = (lls) obj;
        llsVar.getClass();
        String str = llsVar.i;
        String str2 = llsVar.h;
        Integer num = llsVar.g;
        String str3 = llsVar.f;
        String str4 = llsVar.e;
        Integer num2 = llsVar.d;
        Boolean bool = llsVar.c;
        Long l = llsVar.b;
        ols olsVar = llsVar.f20264a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lls.j;
        if (cldVarA.u(ugi0Var) || olsVar != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), olsVar);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
