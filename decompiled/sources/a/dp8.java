package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class dp8 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6451a;
    public final /* synthetic */ rv2 b;

    public /* synthetic */ dp8(rv2 rv2Var, byte b) {
        this.f6451a = b;
        this.b = rv2Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f6451a;
        rv2 rv2Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Object objD = dv2.d(rv2Var, pt2.c, yjeVar);
                    return objD == wne.f39444a ? objD : Unit.f46060a;
                }
                Object objD2 = dv2.d(rv2Var, pt2.b, yjeVar);
                return objD2 == wne.f39444a ? objD2 : Unit.f46060a;
            default:
                ((Boolean) obj).getClass();
                agk0 agk0Var = rv2Var.f;
                float fL = agk0Var.l();
                vtj vtjVarD = rv2Var.d();
                ot2 ot2Var = ot2.b;
                if (fL == vtjVarD.d(ot2Var) || agk0Var.l() == rv2Var.d().d(ot2.f25810a)) {
                    return Unit.f46060a;
                }
                Object objC = dv2.c(rv2Var, ot2Var, nu2.f24127a, yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
        }
    }
}
