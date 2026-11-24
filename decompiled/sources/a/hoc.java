package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hoc {
    public static final hoc b = new hoc(0);
    public static final hoc c = new hoc(1);
    public static final hoc d = new hoc(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13387a;

    public /* synthetic */ hoc(byte b2) {
        this.f13387a = b2;
    }

    public static String a(foc focVar) {
        String strZ;
        g950 name = focVar.getName();
        name.getClass();
        String strA = xdx.A(name);
        if (!(focVar instanceof hzs0)) {
            vjj vjjVarJ = focVar.j();
            vjjVarJ.getClass();
            if (vjjVarJ instanceof wm40) {
                strZ = a((foc) vjjVarJ);
            } else {
                strZ = vjjVarJ instanceof mg80 ? xdx.z(((ng80) ((mg80) vjjVarJ)).f.f32934a) : null;
            }
            if (strZ != null && !strZ.equals("")) {
                return strZ + '.' + strA;
            }
        }
        return strA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.foc, a.vjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.vjj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.vjj] */
    public final String b(foc focVar, iek iekVar) {
        byte b2 = this.f13387a;
        focVar.getClass();
        switch (b2) {
            case 0:
                if (focVar instanceof hzs0) {
                    g950 name = ((hzs0) focVar).getName();
                    name.getClass();
                    return iekVar.F(name, false);
                }
                twq twqVarF = oek.f(focVar);
                twqVarF.getClass();
                return iekVar.l(xdx.C(twq.f(twqVarF)));
            case 1:
                if (focVar instanceof hzs0) {
                    g950 name2 = ((hzs0) focVar).getName();
                    name2.getClass();
                    return iekVar.F(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(focVar.getName());
                    focVar = focVar.j();
                } while (focVar instanceof wm40);
                return xdx.C(new yag0(arrayList));
            default:
                return a(focVar);
        }
    }
}
