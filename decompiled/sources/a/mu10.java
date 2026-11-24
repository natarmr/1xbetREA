package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mu10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mu10 f22393a;
    private static final ugi0 descriptor;

    static {
        mu10 mu10Var = new mu10();
        f22393a = mu10Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.MainFeedChampsResponse.SubLigaResponse", mu10Var, 13);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("image", true);
        zna0Var.j("altImage", true);
        zna0Var.j("countryImage", true);
        zna0Var.j("countryId", true);
        zna0Var.j("countryName", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("isNew", true);
        zna0Var.j("isTop", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("games", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ou10.n;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ou10.n;
        List list = null;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l2 = null;
        Integer num = null;
        int i = 0;
        Long l3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        String str5 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    l = l;
                    list = list;
                    break;
                case 0:
                    l3 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i |= 1;
                    l = l;
                    list = list;
                    break;
                case 1:
                    list = list;
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    l3 = l3;
                    list = list;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    l3 = l3;
                    str = str;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    l3 = l3;
                    str = str;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    l3 = l3;
                    str = str;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    l3 = l3;
                    str = str;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    l3 = l3;
                    str = str;
                    break;
                case 7:
                    num = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num);
                    i |= 128;
                    l3 = l3;
                    str = str;
                    break;
                case 8:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool2);
                    i |= 256;
                    l3 = l3;
                    str = str;
                    break;
                case 9:
                    bool = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool);
                    i |= 512;
                    l3 = l3;
                    str = str;
                    break;
                case 10:
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i |= 1024;
                    l3 = l3;
                    str = str;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    l3 = l3;
                    str = str;
                    break;
                case 12:
                    l2 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l2);
                    i |= 4096;
                    l3 = l3;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l4 = l;
        bldVarA.c(ugi0Var);
        return new ou10(i, l3, str, str2, str3, str4, num2, str5, num, bool2, bool, l4, list, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ou10 ou10Var = (ou10) obj;
        ou10Var.getClass();
        Long l = ou10Var.m;
        List list = ou10Var.l;
        Long l2 = ou10Var.k;
        Boolean bool = ou10Var.j;
        Boolean bool2 = ou10Var.i;
        Integer num = ou10Var.h;
        String str = ou10Var.g;
        Integer num2 = ou10Var.f;
        String str2 = ou10Var.e;
        String str3 = ou10Var.d;
        String str4 = ou10Var.c;
        String str5 = ou10Var.b;
        Long l3 = ou10Var.f25855a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ou10.n;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
