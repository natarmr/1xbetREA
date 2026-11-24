package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aat implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aat f546a;
    private static final ugi0 descriptor;

    static {
        aat aatVar = new aat();
        f546a = aatVar;
        zna0 zna0Var = new zna0("org.xplatform.games_mania.data.models.GamesManiaRoundResponse", aatVar, 3);
        zna0Var.j("BS", true);
        zna0Var.j("ST", true);
        zna0Var.j("SW", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = cat.d;
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cat.d;
        boolean z = true;
        int i = 0;
        Double d = null;
        List list = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new cat(i, d, list, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cat catVar = (cat) obj;
        catVar.getClass();
        Double d = catVar.c;
        List list = catVar.b;
        Double d2 = catVar.f4029a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cat.d;
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
