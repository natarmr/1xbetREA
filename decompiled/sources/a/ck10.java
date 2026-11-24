package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ck10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ck10 f4486a;
    private static final ugi0 descriptor;

    static {
        ck10 ck10Var = new ck10();
        f4486a = ck10Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_card.data.model.LuckyCardResponse", ck10Var, 6);
        zna0Var.j("RS", true);
        zna0Var.j("SB", true);
        zna0Var.j("SW", true);
        zna0Var.j("NB", true);
        zna0Var.j("CF", true);
        zna0Var.j("AI", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) ek10.g[0].getValue());
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ek10.g;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d3);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new ek10(i, list, str, d, d2, d3, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ek10 ek10Var = (ek10) obj;
        ek10Var.getClass();
        Long l = ek10Var.f;
        Double d = ek10Var.e;
        Double d2 = ek10Var.d;
        Double d3 = ek10Var.c;
        String str = ek10Var.b;
        List list = ek10Var.f7934a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ek10.g;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
