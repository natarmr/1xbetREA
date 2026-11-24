package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mu0 f22390a;
    private static final ugi0 descriptor;

    static {
        mu0 mu0Var = new mu0();
        f22390a = mu0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.metrics.api.models.AggregatorGameMetricsRequest", mu0Var, 4);
        zna0Var.j("partId", false);
        zna0Var.j("index", false);
        zna0Var.j("screen", false);
        zna0Var.j("launchEntities", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0((jiy) ou0.e[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ou0.e;
        int i = 0;
        long jR = 0;
        Integer num = null;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ou0(i, jR, num, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ou0 ou0Var = (ou0) obj;
        ou0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ou0.e;
        cldVarA.n(ugi0Var, 0, ou0Var.f25853a);
        cldVarA.p(ugi0Var, 1, okx.f25427a, ou0Var.b);
        cldVarA.p(ugi0Var, 2, ysm0.f43175a, ou0Var.c);
        cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), ou0Var.d);
        cldVarA.c(ugi0Var);
    }
}
