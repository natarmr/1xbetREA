package a;

import android.gov.nist.javax.sip.ListeningPointExt;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0l implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0l f38354a;
    private static final ugi0 descriptor;

    static {
        w0l w0lVar = new w0l();
        f38354a = w0lVar;
        zna0 zna0Var = new zna0("org.xplatform.domino.data.model.response.DominoResponse", w0lVar, 19);
        zna0Var.j("P1", true);
        zna0Var.j("GI", true);
        zna0Var.j("AN", true);
        zna0Var.j("P2", true);
        zna0Var.j("GS", true);
        zna0Var.j("IF", true);
        zna0Var.j("BS", true);
        zna0Var.j("RC", true);
        zna0Var.j(ListeningPointExt.WS, true);
        zna0Var.j("FD", true);
        zna0Var.j("ED", true);
        zna0Var.j("GF", true);
        zna0Var.j("TN", true);
        zna0Var.j("P1List", true);
        zna0Var.j("BNINF", true);
        zna0Var.j("AI", true);
        zna0Var.k(new iy(new String[]{"BAC"}, (byte) 14));
        zna0Var.j("BA", true);
        zna0Var.k(new iy(new String[]{"NB", "Balanse"}, (byte) 14));
        zna0Var.j("BL", true);
        zna0Var.j("CF", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = y0l.t;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(tblVar), mrv.j0(sm8.f32432a), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(ok10.f25385a), mrv.j0(s710.f31729a), mrv.j0(tblVar), mrv.j0(okxVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        Double d;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = y0l.t;
        List list = null;
        List list2 = null;
        List list3 = null;
        Double d2 = null;
        Integer num2 = null;
        Boolean bool = null;
        int i2 = 0;
        List list4 = null;
        rk10 rk10Var = null;
        Long l = null;
        Double d3 = null;
        Integer num3 = null;
        Double d4 = null;
        Double d5 = null;
        boolean z = true;
        Integer num4 = null;
        String str = null;
        Integer num5 = null;
        List list5 = null;
        Integer num6 = null;
        Integer num7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num4;
                    z = false;
                    list2 = list2;
                    d5 = d5;
                    num4 = num;
                    list = list;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num4);
                    i2 |= 1;
                    list2 = list2;
                    d5 = d5;
                    bool = bool;
                    num4 = num;
                    list = list;
                    break;
                case 1:
                    d = d5;
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i2 |= 2;
                    num5 = num5;
                    d5 = d;
                    bool = bool;
                    list = list;
                    break;
                case 2:
                    d = d5;
                    num5 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num5);
                    i2 |= 4;
                    d5 = d;
                    bool = bool;
                    list = list;
                    break;
                case 3:
                    d = d5;
                    list5 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list5);
                    i2 |= 8;
                    d5 = d;
                    bool = bool;
                    list = list;
                    break;
                case 4:
                    d = d5;
                    num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                    i2 |= 16;
                    d5 = d;
                    bool = bool;
                    list = list;
                    break;
                case 5:
                    d = d5;
                    num7 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num7);
                    i2 |= 32;
                    d5 = d;
                    bool = bool;
                    list = list;
                    break;
                case 6:
                    list = list;
                    bool = bool;
                    d5 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d5);
                    i2 |= 64;
                    bool = bool;
                    list = list;
                    break;
                case 7:
                    list = list;
                    bool = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool);
                    i2 |= 128;
                    d5 = d5;
                    list = list;
                    break;
                case 8:
                    bool = bool;
                    d5 = d5;
                    d2 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d2);
                    i2 |= 256;
                    d5 = d5;
                    bool = bool;
                    break;
                case 9:
                    bool = bool;
                    d5 = d5;
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i2 |= 512;
                    d5 = d5;
                    bool = bool;
                    break;
                case 10:
                    bool = bool;
                    d5 = d5;
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i2 |= 1024;
                    d5 = d5;
                    bool = bool;
                    break;
                case 11:
                    bool = bool;
                    d5 = d5;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    d5 = d5;
                    bool = bool;
                    break;
                case 12:
                    bool = bool;
                    d5 = d5;
                    num2 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num2);
                    i2 |= 4096;
                    d5 = d5;
                    bool = bool;
                    break;
                case 13:
                    bool = bool;
                    d5 = d5;
                    list4 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list4);
                    i2 |= 8192;
                    d5 = d5;
                    bool = bool;
                    break;
                case 14:
                    bool = bool;
                    d5 = d5;
                    rk10Var = (rk10) bldVarA.e(ugi0Var, 14, ok10.f25385a, rk10Var);
                    i2 |= 16384;
                    d5 = d5;
                    bool = bool;
                    break;
                case 15:
                    l = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l);
                    i = 32768;
                    i2 |= i;
                    d5 = d5;
                    bool = bool;
                    break;
                case 16:
                    d3 = (Double) bldVarA.e(ugi0Var, 16, tbl.f33669a, d3);
                    i = 65536;
                    i2 |= i;
                    d5 = d5;
                    bool = bool;
                    break;
                case 17:
                    num3 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num3);
                    i = 131072;
                    i2 |= i;
                    d5 = d5;
                    bool = bool;
                    break;
                case 18:
                    d4 = (Double) bldVarA.e(ugi0Var, 18, tbl.f33669a, d4);
                    i = 262144;
                    i2 |= i;
                    d5 = d5;
                    bool = bool;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list6 = list;
        Double d6 = d5;
        Integer num8 = num4;
        String str2 = str;
        Integer num9 = num5;
        bldVarA.c(ugi0Var);
        return new y0l(i2, num8, str2, num9, list5, num6, num7, d6, bool, d2, list3, list2, list6, num2, list4, rk10Var, l, d3, num3, d4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y0l y0lVar = (y0l) obj;
        y0lVar.getClass();
        Double d = y0lVar.s;
        Integer num = y0lVar.r;
        Double d2 = y0lVar.q;
        Long l = y0lVar.p;
        rk10 rk10Var = y0lVar.o;
        List list = y0lVar.n;
        Integer num2 = y0lVar.m;
        List list2 = y0lVar.l;
        List list3 = y0lVar.k;
        List list4 = y0lVar.j;
        Double d3 = y0lVar.i;
        Boolean bool = y0lVar.h;
        Double d4 = y0lVar.g;
        Integer num3 = y0lVar.f;
        Integer num4 = y0lVar.e;
        List list5 = y0lVar.d;
        Integer num5 = y0lVar.c;
        String str = y0lVar.b;
        Integer num6 = y0lVar.f41811a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = y0l.t;
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || rk10Var != null) {
            cldVarA.p(ugi0Var, 14, ok10.f25385a, rk10Var);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 16, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 18, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
