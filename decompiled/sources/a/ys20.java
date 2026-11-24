package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ys20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ys20 f43149a;
    private static final ugi0 descriptor;

    static {
        ys20 ys20Var = new ys20();
        f43149a = ys20Var;
        zna0 zna0Var = new zna0("org.xplatform.market_statistic.data.model.MarketChartEventReponse", ys20Var, 3);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("group", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(dfo.f6008a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        jfo jfoVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jfoVar = (jfo) bldVarA.e(ugi0Var, 2, dfo.f6008a, jfoVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new at20(i, num, num2, jfoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        at20 at20Var = (at20) obj;
        at20Var.getClass();
        jfo jfoVar = at20Var.c;
        Integer num = at20Var.b;
        Integer num2 = at20Var.f1415a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || jfoVar != null) {
            cldVarA.p(ugi0Var, 2, dfo.f6008a, jfoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
