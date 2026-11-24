package a;

import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y9m0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y9m0 f42256a;
    private static final ugi0 descriptor;

    static {
        y9m0 y9m0Var = new y9m0();
        f42256a = y9m0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel", y9m0Var, 3);
        zna0Var.j("statId", false);
        zna0Var.j("statPosition", false);
        zna0Var.j("selected", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{StatisticBlockModel.d[0].getValue(), okx.f25427a, sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = StatisticBlockModel.d;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        t9m0 t9m0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                t9m0Var = (t9m0) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), t9m0Var);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new StatisticBlockModel(i, t9m0Var, iJ, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        StatisticBlockModel statisticBlockModel = (StatisticBlockModel) obj;
        statisticBlockModel.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) StatisticBlockModel.d[0].getValue(), statisticBlockModel.f46623a);
        cldVarA.i(1, statisticBlockModel.b, ugi0Var);
        cldVarA.x(ugi0Var, 2, statisticBlockModel.c);
        cldVarA.c(ugi0Var);
    }
}
