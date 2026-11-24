package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hq1 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hq1 f13465a;
    private static final ugi0 descriptor;

    static {
        hq1 hq1Var = new hq1();
        f13465a = hq1Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.category.data.models.AggregatorSpecialBannerNavigationData.Category", hq1Var, 2);
        zna0Var.j("partId", true);
        zna0Var.j("brandIds", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0((jiy) jq1.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jq1.c;
        boolean z = true;
        int i = 0;
        Long l = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
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
        return new jq1(i, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jq1 jq1Var = (jq1) obj;
        jq1Var.getClass();
        List list = jq1Var.b;
        Long l = jq1Var.f16927a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jq1.c;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
