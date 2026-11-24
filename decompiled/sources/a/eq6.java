package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eq6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eq6 f8221a;
    private static final ugi0 descriptor;

    static {
        eq6 eq6Var = new eq6();
        f8221a = eq6Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.games.data.BetConstructorGameResponse", eq6Var, 17);
        zna0Var.j("l", true);
        zna0Var.j("i", true);
        zna0Var.j("o1", true);
        zna0Var.j("o2", true);
        zna0Var.j("c1", true);
        zna0Var.j("c2", true);
        zna0Var.j("cx", true);
        zna0Var.j("si", true);
        zna0Var.j("sn", true);
        zna0Var.j("s", true);
        zna0Var.j("cv1", true);
        zna0Var.j("cv2", true);
        zna0Var.j("cvx", true);
        zna0Var.j("o1is", true);
        zna0Var.j("o2is", true);
        zna0Var.j("o1IMG", true);
        zna0Var.j("o2IMG", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = gq6.r;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(s710.f31729a), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0((jiy) a8zVarArr[15].getValue()), mrv.j0((jiy) a8zVarArr[16].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Double d;
        int i;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = gq6.r;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        int i2 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        boolean z = true;
        String str6 = null;
        Integer num2 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str6;
                    z = false;
                    str3 = str3;
                    d3 = d3;
                    str6 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str6);
                    i2 |= 1;
                    str3 = str3;
                    d2 = d2;
                    d3 = d3;
                    str6 = str;
                    str2 = str2;
                    break;
                case 1:
                    d = d2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i2 |= 2;
                    str7 = str7;
                    d2 = d;
                    str2 = str2;
                    d3 = d3;
                    break;
                case 2:
                    d = d2;
                    str7 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str7);
                    i2 |= 4;
                    d2 = d;
                    str2 = str2;
                    d3 = d3;
                    break;
                case 3:
                    d = d2;
                    str8 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str8);
                    i2 |= 8;
                    d2 = d;
                    str2 = str2;
                    d3 = d3;
                    break;
                case 4:
                    str2 = str2;
                    d3 = d3;
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i2 |= 16;
                    str2 = str2;
                    d3 = d3;
                    break;
                case 5:
                    str2 = str2;
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i2 |= 32;
                    d2 = d2;
                    str2 = str2;
                    break;
                case 6:
                    d2 = d2;
                    d3 = d3;
                    d4 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d4);
                    i2 |= 64;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 7:
                    d2 = d2;
                    d3 = d3;
                    l = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l);
                    i2 |= 128;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 8:
                    d2 = d2;
                    d3 = d3;
                    str4 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str4);
                    i2 |= 256;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 9:
                    d2 = d2;
                    d3 = d3;
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i2 |= 512;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 10:
                    d2 = d2;
                    d3 = d3;
                    str3 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str3);
                    i2 |= 1024;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 11:
                    d2 = d2;
                    d3 = d3;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 12:
                    d2 = d2;
                    d3 = d3;
                    str5 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str5);
                    i2 |= 4096;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 13:
                    d2 = d2;
                    d3 = d3;
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i2 |= 8192;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 14:
                    d2 = d2;
                    d3 = d3;
                    list2 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
                    i2 |= 16384;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 15:
                    list3 = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list3);
                    i = 32768;
                    i2 |= i;
                    d2 = d2;
                    d3 = d3;
                    break;
                case 16:
                    list4 = (List) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list4);
                    i = 65536;
                    i2 |= i;
                    d2 = d2;
                    d3 = d3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str9 = str2;
        Double d5 = d3;
        bldVarA.c(ugi0Var);
        return new gq6(i2, str6, num2, str7, str8, d2, d5, d4, l, str4, num, str3, str9, str5, list, list2, list3, list4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gq6 gq6Var = (gq6) obj;
        gq6Var.getClass();
        List list = gq6Var.q;
        List list2 = gq6Var.p;
        List list3 = gq6Var.o;
        List list4 = gq6Var.n;
        String str = gq6Var.m;
        String str2 = gq6Var.l;
        String str3 = gq6Var.k;
        Integer num = gq6Var.j;
        String str4 = gq6Var.i;
        Long l = gq6Var.h;
        Double d = gq6Var.g;
        Double d2 = gq6Var.f;
        Double d3 = gq6Var.e;
        String str5 = gq6Var.d;
        String str6 = gq6Var.c;
        Integer num2 = gq6Var.b;
        String str7 = gq6Var.f11716a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = gq6.r;
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list4 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
