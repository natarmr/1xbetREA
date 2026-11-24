package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bt20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bt20 f3161a;
    private static final ugi0 descriptor;

    static {
        bt20 bt20Var = new bt20();
        f3161a = bt20Var;
        zna0 zna0Var = new zna0("org.xplatform.market_statistic.data.model.MarketChartLineResponse", bt20Var, 2);
        zna0Var.j("event", true);
        zna0Var.j("points", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ys20.f43149a), mrv.j0((jiy) dt20.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dt20.c;
        boolean z = true;
        int i = 0;
        at20 at20Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                at20Var = (at20) bldVarA.e(ugi0Var, 0, ys20.f43149a, at20Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new dt20(i, at20Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dt20 dt20Var = (dt20) obj;
        dt20Var.getClass();
        List list = dt20Var.b;
        at20 at20Var = dt20Var.f6642a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dt20.c;
        if (cldVarA.u(ugi0Var) || at20Var != null) {
            cldVarA.p(ugi0Var, 0, ys20.f43149a, at20Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
