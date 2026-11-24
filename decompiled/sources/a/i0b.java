package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0b implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0b f13942a;
    private static final ugi0 descriptor;

    static {
        i0b i0bVar = new i0b();
        f13942a = i0bVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.cashback.data.models.CashbackRules", i0bVar, 5);
        zna0Var.j("limitInEuro", true);
        zna0Var.j("regularPercentage", true);
        zna0Var.j("increasePercentage", true);
        zna0Var.j("resetDate", true);
        zna0Var.j("companyGamesChoice", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = k0b.f;
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = k0b.f;
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Long l = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                i |= 2;
            } else if (iF == 2) {
                d3 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d3);
                i |= 4;
            } else if (iF == 3) {
                l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new k0b(i, d, d2, d3, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k0b k0bVar = (k0b) obj;
        k0bVar.getClass();
        List list = k0bVar.e;
        Long l = k0bVar.d;
        Double d = k0bVar.c;
        Double d2 = k0bVar.b;
        Double d3 = k0bVar.f17457a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = k0b.f;
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
