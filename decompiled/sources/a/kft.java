package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kft implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kft f18212a;
    private static final ugi0 descriptor;

    static {
        kft kftVar = new kft();
        f18212a = kftVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.gems_odyssey.GemsOdysseyGameResponse", kftVar, 8);
        zna0Var.j("AN", true);
        zna0Var.j("RS", true);
        zna0Var.j("SB", true);
        zna0Var.j("BS", true);
        zna0Var.j("SW", true);
        zna0Var.j("AI", true);
        zna0Var.k(new iy(new String[]{"BAC"}, (byte) 19));
        zna0Var.j("BL", true);
        zna0Var.k(new iy(new String[]{"NB", "BA", "Balanse"}, (byte) 19));
        zna0Var.j("BNINF", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mft.i;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(s710.f31729a), mrv.j0(tblVar), mrv.j0(ok10.f25385a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mft.i;
        Object obj = null;
        boolean z = true;
        rk10 rk10Var = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        Double d = null;
        Double d2 = null;
        Long l = null;
        Double d3 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    d3 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d3);
                    i |= 64;
                    break;
                case 7:
                    rk10Var = (rk10) bldVarA.e(ugi0Var, 7, ok10.f25385a, rk10Var);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new mft(i, num, list, num2, d, d2, l, d3, rk10Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mft mftVar = (mft) obj;
        mftVar.getClass();
        rk10 rk10Var = mftVar.h;
        Double d = mftVar.g;
        Long l = mftVar.f;
        Double d2 = mftVar.e;
        Double d3 = mftVar.d;
        Integer num = mftVar.c;
        List list = mftVar.b;
        Integer num2 = mftVar.f21710a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mft.i;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || rk10Var != null) {
            cldVarA.p(ugi0Var, 7, ok10.f25385a, rk10Var);
        }
        cldVarA.c(ugi0Var);
    }
}
