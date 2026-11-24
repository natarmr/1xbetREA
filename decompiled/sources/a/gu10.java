package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gu10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gu10 f11908a;
    private static final ugi0 descriptor;

    static {
        gu10 gu10Var = new gu10();
        f11908a = gu10Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.MainFeedChampsResponse.MainLigaResponse", gu10Var, 15);
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
        zna0Var.j("subLigas", true);
        zna0Var.j("subChampsCount", true);
        zna0Var.j("games", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = iu10.p;
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
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = iu10.p;
        List list = null;
        Long l2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Integer num2 = null;
        int i = 0;
        List list2 = null;
        Long l3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num3 = null;
        String str5 = null;
        boolean z = true;
        Long l4 = null;
        String str6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l4;
                    z = false;
                    l2 = l2;
                    str3 = str3;
                    l4 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i |= 1;
                    l2 = l2;
                    str2 = str2;
                    str3 = str3;
                    l4 = l;
                    list = list;
                    break;
                case 1:
                    str = str3;
                    str6 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str6);
                    i |= 2;
                    str2 = str2;
                    str3 = str;
                    list = list;
                    break;
                case 2:
                    str = str3;
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    str3 = str;
                    list = list;
                    break;
                case 3:
                    list = list;
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    str2 = str2;
                    list = list;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 5:
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i |= 32;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 7:
                    num2 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num2);
                    i |= 128;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 8:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool2);
                    i |= 256;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 9:
                    bool = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool);
                    i |= 512;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 10:
                    l2 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l2);
                    i |= 1024;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 12:
                    num = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num);
                    i |= 4096;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 13:
                    list2 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
                    i |= 8192;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 14:
                    l3 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l3);
                    i |= 16384;
                    str2 = str2;
                    str3 = str3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list3 = list;
        String str7 = str3;
        bldVarA.c(ugi0Var);
        return new iu10(i, l4, str6, str2, str7, str4, num3, str5, num2, bool2, bool, l2, list3, num, list2, l3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iu10 iu10Var = (iu10) obj;
        iu10Var.getClass();
        Long l = iu10Var.o;
        List list = iu10Var.n;
        Integer num = iu10Var.m;
        List list2 = iu10Var.l;
        Long l2 = iu10Var.k;
        Boolean bool = iu10Var.j;
        Boolean bool2 = iu10Var.i;
        Integer num2 = iu10Var.h;
        String str = iu10Var.g;
        Integer num3 = iu10Var.f;
        String str2 = iu10Var.e;
        String str3 = iu10Var.d;
        String str4 = iu10Var.c;
        String str5 = iu10Var.b;
        Long l3 = iu10Var.f15378a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = iu10.p;
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
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
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
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
