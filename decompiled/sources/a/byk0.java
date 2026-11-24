package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class byk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3424a;
    public final /* synthetic */ hyk0 b;

    public /* synthetic */ byk0(hyk0 hyk0Var, byte b) {
        this.f3424a = b;
        this.b = hyk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3424a;
        hyk0 hyk0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = hyk0.U1;
                i1w0 i1w0VarF = a4n0.f(hyk0Var);
                jui juiVar = hyk0Var.L1;
                if (juiVar != null) {
                    return new ry3(i1w0VarF, juiVar);
                }
                Intrinsics.h("spinAndViewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = hyk0.U1;
                return new dyk0(hyk0Var);
            default:
                iiy[] iiyVarArr3 = hyk0.U1;
                hyk0Var.H0().w();
                return Unit.f46060a;
        }
    }
}
