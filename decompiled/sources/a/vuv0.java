package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class vuv0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38068a;
    public final /* synthetic */ ywv0 b;

    public /* synthetic */ vuv0(ywv0 ywv0Var, byte b) {
        this.f38068a = b;
        this.b = ywv0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f38068a;
        ywv0 ywv0Var = this.b;
        switch (b) {
            case 0:
                pb5 pb5Var = (pb5) obj;
                fht0 fht0Var = ywv0Var.c;
                glt0 glt0Var = ywv0Var.d;
                cvv0 cvv0VarF = fht0Var.f();
                if (cvv0VarF == null) {
                    return Unit.f46060a;
                }
                Object objG = glt0Var.g((1.0f - pb5Var.c) * ktt0.g(cvv0VarF, glt0Var.d()), yjeVar);
                return objG == wne.f39444a ? objG : Unit.f46060a;
            default:
                Object objL = wbl0.l(ywv0Var, yjeVar);
                return objL == wne.f39444a ? objL : Unit.f46060a;
        }
    }
}
