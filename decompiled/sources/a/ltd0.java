package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ltd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ltd0 f20626a;
    private static final ugi0 descriptor;

    static {
        ltd0 ltd0Var = new ltd0();
        f20626a = ltd0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.races.data.models.RacesStatisticInfoResponse", ltd0Var, 10);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("tournTitle", true);
        zna0Var.j("trackTitle", true);
        zna0Var.j("trackId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("dateStart", true);
        zna0Var.j("circuitLength", true);
        zna0Var.j("laps", true);
        zna0Var.j("raceDistance", true);
        zna0Var.j("menu", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ntd0.k;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ntd0.k;
        List list = null;
        Long l = null;
        boolean z = true;
        Long l2 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Integer num = null;
        Long l4 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    l4 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l4);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    break;
                case 9:
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new ntd0(i, str, str2, str3, l3, num, l4, str4, l2, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ntd0 ntd0Var = (ntd0) obj;
        ntd0Var.getClass();
        List list = ntd0Var.j;
        Long l = ntd0Var.i;
        Long l2 = ntd0Var.h;
        String str = ntd0Var.g;
        Long l3 = ntd0Var.f;
        Integer num = ntd0Var.e;
        Long l4 = ntd0Var.d;
        String str2 = ntd0Var.c;
        String str3 = ntd0Var.b;
        String str4 = ntd0Var.f24094a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ntd0.k;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
