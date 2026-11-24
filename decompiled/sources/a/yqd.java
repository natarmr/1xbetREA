package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yqd implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yqd f43070a;
    private static final ugi0 descriptor;

    static {
        yqd yqdVar = new yqd();
        f43070a = yqdVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.daily_tasks.impl.data.model.ConditionStateResponse", yqdVar, 8);
        zna0Var.j("minAmountOperation", true);
        zna0Var.j("currency", true);
        zna0Var.j("percentCompleted", true);
        zna0Var.j("currentAmount", true);
        zna0Var.j("necessaryAmount", true);
        zna0Var.j("currentCount", true);
        zna0Var.j("necessaryCount", true);
        zna0Var.j("product", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ0 = mrv.j0(tblVar);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ2 = mrv.j0(tblVar);
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(tblVar);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ozb0.f26096a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Integer num = null;
        Integer num2 = null;
        szb0 szb0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    d3 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d3);
                    i |= 8;
                    break;
                case 4:
                    d4 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d4);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    szb0Var = (szb0) bldVarA.e(ugi0Var, 7, ozb0.f26096a, szb0Var);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ard(i, d, str, d2, d3, d4, num, num2, szb0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ard ardVar = (ard) obj;
        ardVar.getClass();
        szb0 szb0Var = ardVar.h;
        Integer num = ardVar.g;
        Integer num2 = ardVar.f;
        Double d = ardVar.e;
        Double d2 = ardVar.d;
        Double d3 = ardVar.c;
        String str = ardVar.b;
        Double d4 = ardVar.f1340a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || szb0Var != null) {
            cldVarA.p(ugi0Var, 7, ozb0.f26096a, szb0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
