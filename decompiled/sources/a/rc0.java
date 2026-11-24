package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rc0 f30215a;
    private static final ugi0 descriptor;

    static {
        rc0 rc0Var = new rc0();
        f30215a = rc0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.category.data.models.AggregatorBrandDataResponse", rc0Var, 15);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("imgSidebar", true);
        zna0Var.j("imgLanding", true);
        zna0Var.j("imgFooter", true);
        zna0Var.j("imgDropdown", true);
        zna0Var.j("imgLight", true);
        zna0Var.j("imgDark", true);
        zna0Var.j("imgBanner", true);
        zna0Var.j("imgPictogram", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("description", true);
        zna0Var.j("viewType", true);
        zna0Var.j("nameForUrl", true);
        zna0Var.j("partitions", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = tc0.p;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(jz8.f17397a), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[14].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tc0.p;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        iz8 iz8Var = null;
        String str4 = null;
        int i = 0;
        String str5 = null;
        List list = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z = true;
        Long l2 = null;
        String str11 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l2;
                    z = false;
                    num = num;
                    str7 = str7;
                    l2 = l;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i |= 1;
                    num = num;
                    str6 = str6;
                    str7 = str7;
                    l2 = l;
                    str = str;
                    break;
                case 1:
                    str7 = str7;
                    str11 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str11);
                    i |= 2;
                    str6 = str6;
                    str = str;
                    str7 = str7;
                    break;
                case 2:
                    str7 = str7;
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i |= 4;
                    str = str;
                    str7 = str7;
                    break;
                case 3:
                    str = str;
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i |= 8;
                    str6 = str6;
                    str = str;
                    break;
                case 4:
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    i |= 16;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 5:
                    str9 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str9);
                    i |= 32;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 6:
                    str10 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str10);
                    i |= 64;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 7:
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i |= 128;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 8:
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i |= 256;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 9:
                    str2 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str2);
                    i |= 512;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 12:
                    iz8Var = (iz8) bldVarA.e(ugi0Var, 12, jz8.f17397a, iz8Var);
                    i |= 4096;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 13:
                    str5 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str5);
                    i |= 8192;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 14:
                    list = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
                    i |= 16384;
                    str6 = str6;
                    str7 = str7;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str12 = str;
        String str13 = str7;
        Long l3 = l2;
        String str14 = str11;
        bldVarA.c(ugi0Var);
        return new tc0(i, l3, str14, str6, str13, str8, str9, str10, str4, str3, str2, num, str12, iz8Var, str5, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tc0 tc0Var = (tc0) obj;
        tc0Var.getClass();
        List list = tc0Var.o;
        String str = tc0Var.n;
        iz8 iz8Var = tc0Var.m;
        String str2 = tc0Var.l;
        Integer num = tc0Var.k;
        String str3 = tc0Var.j;
        String str4 = tc0Var.i;
        String str5 = tc0Var.h;
        String str6 = tc0Var.g;
        String str7 = tc0Var.f;
        String str8 = tc0Var.e;
        String str9 = tc0Var.d;
        String str10 = tc0Var.c;
        String str11 = tc0Var.b;
        Long l = tc0Var.f33695a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tc0.p;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str8);
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
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || iz8Var != 0) {
            cldVarA.p(ugi0Var, 12, jz8.f17397a, iz8Var);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
