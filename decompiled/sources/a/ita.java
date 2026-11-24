package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ita implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15345a;
    public final /* synthetic */ cgk0 b;
    public final /* synthetic */ cgk0 c;
    public final /* synthetic */ t33 d;

    public /* synthetic */ ita(cgk0 cgk0Var, cgk0 cgk0Var2, t33 t33Var, byte b) {
        this.f15345a = b;
        this.b = cgk0Var;
        this.c = cgk0Var2;
        this.d = t33Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f15345a;
        t33 t33Var = this.d;
        cgk0 cgk0Var = this.c;
        cgk0 cgk0Var2 = this.b;
        switch (b) {
            case 0:
                Pair pair = (Pair) obj;
                int iIntValue = ((Number) pair.f46059a).intValue();
                int iIntValue2 = ((Number) pair.b).intValue();
                cgk0Var2.m(cgk0Var.l());
                cgk0Var.m(iIntValue2);
                if (iIntValue == 0) {
                    return Unit.f46060a;
                }
                Object objF = t33Var.f(yjeVar, new Float(l1e0.c((float) (((double) si30.b((iIntValue2 / iIntValue) * 100.0f)) / 100.0d), 0.0f, 1.0f)));
                return objF == wne.f39444a ? objF : Unit.f46060a;
            default:
                Pair pair2 = (Pair) obj;
                int iIntValue3 = ((Number) pair2.f46059a).intValue();
                int iIntValue4 = ((Number) pair2.b).intValue();
                cgk0Var2.m(cgk0Var.l());
                cgk0Var.m(iIntValue4);
                if (iIntValue3 == 0) {
                    return Unit.f46060a;
                }
                Object objF2 = t33Var.f(yjeVar, new Float(l1e0.c((float) (((double) si30.b((iIntValue4 / iIntValue3) * 100.0f)) / 100.0d), 0.0f, 1.0f)));
                return objF2 == wne.f39444a ? objF2 : Unit.f46060a;
        }
    }
}
