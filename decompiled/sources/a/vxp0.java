package a;

import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vxp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vxp0 f38212a;
    private static final ugi0 descriptor;

    static {
        vxp0 vxp0Var = new vxp0();
        f38212a = vxp0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel", vxp0Var, 2);
        zna0Var.j("season", false);
        zna0Var.j("surfaceType", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, TennisSummaryFilterModel.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = TennisSummaryFilterModel.c;
        boolean z = true;
        int i = 0;
        String strX = null;
        TennisSurfaceType tennisSurfaceType = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                tennisSurfaceType = (TennisSurfaceType) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), tennisSurfaceType);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new TennisSummaryFilterModel(i, strX, tennisSurfaceType);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        TennisSummaryFilterModel tennisSummaryFilterModel = (TennisSummaryFilterModel) obj;
        tennisSummaryFilterModel.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = TennisSummaryFilterModel.c;
        cldVarA.z(ugi0Var, 0, tennisSummaryFilterModel.f47097a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), tennisSummaryFilterModel.b);
        cldVarA.c(ugi0Var);
    }
}
