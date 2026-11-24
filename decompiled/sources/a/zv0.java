package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zv0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zv0 f45032a;
    private static final ugi0 descriptor;

    static {
        zv0 zv0Var = new zv0();
        f45032a = zv0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGameResponse", zv0Var, 16);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("providerId", true);
        zna0Var.j("product", true);
        zna0Var.j("name", true);
        zna0Var.j("ribbons", true);
        zna0Var.j("images", true);
        zna0Var.j("liveGamesSettings", true);
        zna0Var.j("categoryIds", true);
        zna0Var.j("isDemoAvailable", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("bonusWageringBan", true);
        zna0Var.j("brand", true);
        zna0Var.j("partId", true);
        zna0Var.j("isTest", true);
        zna0Var.j("nameForUrl", true);
        zna0Var.j("lastPlayedAt", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = bw0.q;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(px0.f27732a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0((jiy) a8zVarArr[4].getValue());
        jiy jiyVarJ5 = mrv.j0(jx0.f17278a);
        jiy jiyVarJ6 = mrv.j0(mx0.f22529a);
        jiy jiyVarJ7 = mrv.j0((jiy) a8zVarArr[7].getValue());
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(cx0.f5101a), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bw0.q;
        ex0 ex0Var = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l2 = null;
        List list = null;
        int i = 0;
        Boolean bool4 = null;
        String str2 = null;
        Long l3 = null;
        String str3 = null;
        List list2 = null;
        lx0 lx0Var = null;
        ox0 ox0Var = null;
        boolean z = true;
        Long l4 = null;
        Long l5 = null;
        rx0 rx0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l4;
                    z = false;
                    bool = bool;
                    list2 = list2;
                    l4 = l;
                    ex0Var = ex0Var;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i |= 1;
                    bool = bool;
                    str3 = str3;
                    list2 = list2;
                    l4 = l;
                    ex0Var = ex0Var;
                    break;
                case 1:
                    str = str3;
                    l5 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l5);
                    i |= 2;
                    rx0Var = rx0Var;
                    str3 = str;
                    list2 = list2;
                    ex0Var = ex0Var;
                    break;
                case 2:
                    str = str3;
                    rx0Var = (rx0) bldVarA.e(ugi0Var, 2, px0.f27732a, rx0Var);
                    i |= 4;
                    str3 = str;
                    list2 = list2;
                    ex0Var = ex0Var;
                    break;
                case 3:
                    ex0Var = ex0Var;
                    list2 = list2;
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    list2 = list2;
                    ex0Var = ex0Var;
                    break;
                case 4:
                    ex0Var = ex0Var;
                    list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                    i |= 16;
                    str3 = str3;
                    ex0Var = ex0Var;
                    break;
                case 5:
                    lx0Var = (lx0) bldVarA.e(ugi0Var, 5, jx0.f17278a, lx0Var);
                    i |= 32;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 6:
                    ox0Var = (ox0) bldVarA.e(ugi0Var, 6, mx0.f22529a, ox0Var);
                    i |= 64;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 8:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool3);
                    i |= 256;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 9:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i |= 512;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 11:
                    ex0Var = (ex0) bldVarA.e(ugi0Var, 11, cx0.f5101a, ex0Var);
                    i |= 2048;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 12:
                    l2 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l2);
                    i |= 4096;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 13:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool4);
                    i |= 8192;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 14:
                    str2 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str2);
                    i |= 16384;
                    str3 = str3;
                    list2 = list2;
                    break;
                case 15:
                    l3 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l3);
                    i |= 32768;
                    str3 = str3;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        ex0 ex0Var2 = ex0Var;
        List list3 = list2;
        Long l6 = l4;
        Long l7 = l5;
        rx0 rx0Var2 = rx0Var;
        bldVarA.c(ugi0Var);
        return new bw0(i, l6, l7, rx0Var2, str3, list3, lx0Var, ox0Var, list, bool3, bool2, bool, ex0Var2, l2, bool4, str2, l3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bw0 bw0Var = (bw0) obj;
        bw0Var.getClass();
        Long l = bw0Var.p;
        String str = bw0Var.o;
        Boolean bool = bw0Var.n;
        Long l2 = bw0Var.m;
        ex0 ex0Var = bw0Var.l;
        Boolean bool2 = bw0Var.k;
        Boolean bool3 = bw0Var.j;
        Boolean bool4 = bw0Var.i;
        List list = bw0Var.h;
        ox0 ox0Var = bw0Var.g;
        lx0 lx0Var = bw0Var.f;
        List list2 = bw0Var.e;
        String str2 = bw0Var.d;
        rx0 rx0Var = bw0Var.c;
        Long l3 = bw0Var.b;
        Long l4 = bw0Var.f3301a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bw0.q;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || rx0Var != null) {
            cldVarA.p(ugi0Var, 2, px0.f27732a, rx0Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || lx0Var != null) {
            cldVarA.p(ugi0Var, 5, jx0.f17278a, lx0Var);
        }
        if (cldVarA.u(ugi0Var) || ox0Var != null) {
            cldVarA.p(ugi0Var, 6, mx0.f22529a, ox0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || ex0Var != null) {
            cldVarA.p(ugi0Var, 11, cx0.f5101a, ex0Var);
        }
        if (cldVarA.u(ugi0Var) || l2 != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
