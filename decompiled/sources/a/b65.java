package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b65 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b65 f2036a;
    private static final ugi0 descriptor;

    static {
        b65 b65Var = new b65();
        f2036a = b65Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.AvailableBonusItemResponse", b65Var, 15);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("amount", true);
        zna0Var.j("currency", true);
        zna0Var.j("currentWager", true);
        zna0Var.j("wager", true);
        zna0Var.j("unixTimeExpire", true);
        zna0Var.j("secondsToExpire", true);
        zna0Var.j("unixTimePayment", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("availableCategories", true);
        zna0Var.j("availableGames", true);
        zna0Var.j("availableProducts", true);
        zna0Var.j("unavailableCategories", true);
        zna0Var.j("unavailableGames", true);
        zna0Var.j("unavailableProducts", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = d65.p;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(dom0.f6422a), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0((jiy) a8zVarArr[12].getValue()), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0((jiy) a8zVarArr[14].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = d65.p;
        List list = null;
        List list2 = null;
        List list3 = null;
        fom0 fom0Var = null;
        List list4 = null;
        Long l = null;
        int i = 0;
        List list5 = null;
        List list6 = null;
        String str = null;
        Double d = null;
        Integer num2 = null;
        Long l2 = null;
        Long l3 = null;
        boolean z = true;
        Integer num3 = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num3;
                    z = false;
                    list2 = list2;
                    d = d;
                    num3 = num;
                    list = list;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num3);
                    i |= 1;
                    list2 = list2;
                    str = str;
                    d = d;
                    num3 = num;
                    list = list;
                    break;
                case 1:
                    d = d;
                    d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                    i |= 2;
                    str = str;
                    list = list;
                    d = d;
                    break;
                case 2:
                    d = d;
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    list = list;
                    d = d;
                    break;
                case 3:
                    list = list;
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    str = str;
                    list = list;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    str = str;
                    d = d;
                    break;
                case 5:
                    l2 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l2);
                    i |= 32;
                    str = str;
                    d = d;
                    break;
                case 6:
                    l3 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l3);
                    i |= 64;
                    str = str;
                    d = d;
                    break;
                case 7:
                    l = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l);
                    i |= 128;
                    str = str;
                    d = d;
                    break;
                case 8:
                    fom0Var = (fom0) bldVarA.e(ugi0Var, 8, dom0.f6422a, fom0Var);
                    i |= 256;
                    str = str;
                    d = d;
                    break;
                case 9:
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i |= 512;
                    str = str;
                    d = d;
                    break;
                case 10:
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i |= 1024;
                    str = str;
                    d = d;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    str = str;
                    d = d;
                    break;
                case 12:
                    list4 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list4);
                    i |= 4096;
                    str = str;
                    d = d;
                    break;
                case 13:
                    list5 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list5);
                    i |= 8192;
                    str = str;
                    d = d;
                    break;
                case 14:
                    list6 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list6);
                    i |= 16384;
                    str = str;
                    d = d;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list7 = list;
        Double d3 = d;
        Integer num4 = num3;
        Double d4 = d2;
        bldVarA.c(ugi0Var);
        return new d65(i, num4, d4, str, d3, num2, l2, l3, l, fom0Var, list3, list2, list7, list4, list5, list6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d65 d65Var = (d65) obj;
        d65Var.getClass();
        List list = d65Var.o;
        List list2 = d65Var.n;
        List list3 = d65Var.m;
        List list4 = d65Var.l;
        List list5 = d65Var.k;
        List list6 = d65Var.j;
        fom0 fom0Var = d65Var.i;
        Long l = d65Var.h;
        Long l2 = d65Var.g;
        Long l3 = d65Var.f;
        Integer num = d65Var.e;
        Double d = d65Var.d;
        String str = d65Var.c;
        Double d2 = d65Var.b;
        Integer num2 = d65Var.f5536a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = d65.p;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || fom0Var != null) {
            cldVarA.p(ugi0Var, 8, dom0.f6422a, fom0Var);
        }
        if (cldVarA.u(ugi0Var) || list6 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list6);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
