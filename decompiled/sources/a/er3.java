package a;

import android.gov.nist.javax.sip.ListeningPointExt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class er3 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final er3 f8262a;
    private static final ugi0 descriptor;

    static {
        er3 er3Var = new er3();
        f8262a = er3Var;
        zna0 zna0Var = new zna0("org.xplatform.apple_fortune.data.models.responses.AppleFortuneScrollCellResponse", er3Var, 11);
        zna0Var.j("AI", true);
        zna0Var.j("AN", true);
        zna0Var.j("BS", true);
        zna0Var.j("AP", true);
        zna0Var.j("AU", true);
        zna0Var.j("BA", true);
        zna0Var.j("ST", true);
        zna0Var.j("SW", true);
        zna0Var.j("BNINF", true);
        zna0Var.j(ListeningPointExt.WS, true);
        zna0Var.j("CFS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = gr3.l;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0(tblVar), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(ok10.f25385a), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = gr3.l;
        List list = null;
        List list2 = null;
        rk10 rk10Var = null;
        boolean z = true;
        Double d = null;
        int i = 0;
        Long l = null;
        Integer num = null;
        Double d2 = null;
        List list3 = null;
        List list4 = null;
        Double d3 = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    list4 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list4);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    rk10Var = (rk10) bldVarA.e(ugi0Var, 8, ok10.f25385a, rk10Var);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new gr3(i, l, num, d2, list3, list4, d3, num2, d, rk10Var, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gr3 gr3Var = (gr3) obj;
        gr3Var.getClass();
        List list = gr3Var.k;
        List list2 = gr3Var.j;
        rk10 rk10Var = gr3Var.i;
        Double d = gr3Var.h;
        Integer num = gr3Var.g;
        Double d2 = gr3Var.f;
        List list3 = gr3Var.e;
        List list4 = gr3Var.d;
        Double d3 = gr3Var.c;
        Integer num2 = gr3Var.b;
        Long l = gr3Var.f11762a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = gr3.l;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || rk10Var != null) {
            cldVarA.p(ugi0Var, 8, ok10.f25385a, rk10Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
