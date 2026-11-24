package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v3t0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3t0 f36747a;
    private static final ugi0 descriptor;

    static {
        v3t0 v3t0Var = new v3t0();
        f36747a = v3t0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.calendar.impl.data.ufc.model.UfcCalendarTournamentResponse", v3t0Var, 13);
        zna0Var.j("eventID", true);
        zna0Var.j("tournamentFeedId", true);
        zna0Var.j("feedName", true);
        zna0Var.j("name", true);
        zna0Var.j("startTime", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("city", true);
        zna0Var.j(com.huawei.hms.support.api.entity.common.CommonConstant.ReqAccessTokenParam.STATE_LABEL, true);
        zna0Var.j("country", true);
        zna0Var.j("countryImageS3", true);
        zna0Var.j("triCode", true);
        zna0Var.j("venue", true);
        zna0Var.j("fighters", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = x3t0.n;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[12].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = x3t0.n;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str6 = null;
        String str7 = null;
        Long l3 = null;
        String str8 = null;
        String str9 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str2 = str2;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    str2 = str2;
                    str = str;
                    break;
                case 1:
                    str = str;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    l = l;
                    str = str;
                    break;
                case 2:
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i |= 4;
                    l = l;
                    l2 = l2;
                    break;
                case 3:
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i |= 8;
                    l = l;
                    l2 = l2;
                    break;
                case 4:
                    l3 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l3);
                    i |= 16;
                    l = l;
                    l2 = l2;
                    break;
                case 5:
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    i |= 32;
                    l = l;
                    l2 = l2;
                    break;
                case 6:
                    str9 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str9);
                    i |= 64;
                    l = l;
                    l2 = l2;
                    break;
                case 7:
                    str5 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str5);
                    i |= 128;
                    l = l;
                    l2 = l2;
                    break;
                case 8:
                    str4 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str4);
                    i |= 256;
                    l = l;
                    l2 = l2;
                    break;
                case 9:
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i |= 512;
                    l = l;
                    l2 = l2;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    l = l;
                    l2 = l2;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    l = l;
                    l2 = l2;
                    break;
                case 12:
                    list = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
                    i |= 4096;
                    l = l;
                    l2 = l2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str10 = str2;
        bldVarA.c(ugi0Var);
        return new x3t0(i, l, l2, str6, str7, l3, str8, str9, str5, str4, str3, str10, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x3t0 x3t0Var = (x3t0) obj;
        x3t0Var.getClass();
        List list = x3t0Var.m;
        String str = x3t0Var.l;
        String str2 = x3t0Var.k;
        String str3 = x3t0Var.j;
        String str4 = x3t0Var.i;
        String str5 = x3t0Var.h;
        String str6 = x3t0Var.g;
        String str7 = x3t0Var.f;
        Long l = x3t0Var.e;
        String str8 = x3t0Var.d;
        String str9 = x3t0Var.c;
        Long l2 = x3t0Var.b;
        Long l3 = x3t0Var.f40237a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = x3t0.n;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
