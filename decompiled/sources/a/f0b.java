package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f0b implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0b f8708a;
    private static final ugi0 descriptor;

    static {
        f0b f0bVar = new f0b();
        f8708a = f0bVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.cashback.data.models.CashbackResponse", f0bVar, 10);
        zna0Var.j("userGamesChoice", true);
        zna0Var.j("balanceInEuro", true);
        zna0Var.j("balanceInCurrency", true);
        zna0Var.j("progressBar", true);
        zna0Var.j("betsInMonth", true);
        zna0Var.j("limit", true);
        zna0Var.j("limitInEuro", true);
        zna0Var.j("cashbackRules", true);
        zna0Var.j("nextPayoutDate", true);
        zna0Var.j("serverTime", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) h0b.k[0].getValue());
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(tblVar);
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(tblVar);
        jiy jiyVarJ5 = mrv.j0(tblVar);
        jiy jiyVarJ6 = mrv.j0(tblVar);
        jiy jiyVarJ7 = mrv.j0(i0b.f13942a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = h0b.k;
        Long l = null;
        Long l2 = null;
        boolean z = true;
        k0b k0bVar = null;
        int i = 0;
        List list = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    d3 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    d4 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d4);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    d5 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d5);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    d6 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d6);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    k0bVar = (k0b) bldVarA.e(ugi0Var, 7, i0b.f13942a, k0bVar);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new h0b(i, list, d, d2, d3, d4, d5, d6, k0bVar, l2, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h0b h0bVar = (h0b) obj;
        h0bVar.getClass();
        Long l = h0bVar.j;
        Long l2 = h0bVar.i;
        k0b k0bVar = h0bVar.h;
        Double d = h0bVar.g;
        Double d2 = h0bVar.f;
        Double d3 = h0bVar.e;
        Double d4 = h0bVar.d;
        Double d5 = h0bVar.c;
        Double d6 = h0bVar.b;
        List list = h0bVar.f12226a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = h0b.k;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d4);
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
        if (cldVarA.u(ugi0Var) || k0bVar != null) {
            cldVarA.p(ugi0Var, 7, i0b.f13942a, k0bVar);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
