package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iv2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15423a;
    public final /* synthetic */ qv2 b;

    public /* synthetic */ iv2(qv2 qv2Var, byte b) {
        this.f15423a = b;
        this.b = qv2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15423a;
        qv2 qv2Var = this.b;
        switch (b) {
            case 0:
                Object value = ((hgk0) ((pz40) qv2Var.i)).getValue();
                if (value != null) {
                    return value;
                }
                float fL = ((agk0) qv2Var.l).l();
                boolean zIsNaN = Float.isNaN(fL);
                pz40 pz40Var = (pz40) qv2Var.h;
                return !zIsNaN ? qv2Var.e(fL, 0.0f, ((hgk0) pz40Var).getValue()) : ((hgk0) pz40Var).getValue();
            case 1:
                Object value2 = ((hgk0) ((pz40) qv2Var.i)).getValue();
                if (value2 != null) {
                    return value2;
                }
                float fL2 = ((agk0) qv2Var.l).l();
                boolean zIsNaN2 = Float.isNaN(fL2);
                pz40 pz40Var2 = (pz40) qv2Var.h;
                if (zIsNaN2) {
                    return ((hgk0) pz40Var2).getValue();
                }
                Object value3 = ((hgk0) pz40Var2).getValue();
                no20 no20VarJ = qv2Var.j();
                float fD = no20VarJ.d(value3);
                if (fD != fL2 && !Float.isNaN(fD)) {
                    if (fD < fL2) {
                        Object objB = no20VarJ.b(fL2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = no20VarJ.b(fL2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case 2:
                return qv2Var.j();
            default:
                return new Pair(qv2Var.j(), ((zbk) qv2Var.k).getValue());
        }
    }
}
