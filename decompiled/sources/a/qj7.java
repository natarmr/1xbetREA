package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qj7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28822a;
    public final /* synthetic */ tj7 b;

    public /* synthetic */ qj7(tj7 tj7Var, byte b) {
        this.f28822a = b;
        this.b = tj7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28822a;
        tj7 tj7Var = this.b;
        switch (b) {
            case 0:
                gl5 gl5Var = tj7.t2;
                fiu0 fiu0Var = tj7Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                phf0 phf0Var = tj7Var.m2;
                iiy[] iiyVarArr = tj7.u2;
                vcc.f0(i120.V(new Pair("BET_SALE_CONFIRM_REQUEST", tj7Var.n2.n(tj7Var, iiyVarArr[1]))), tj7Var, phf0Var.n(tj7Var, iiyVarArr[0]));
                qcc.Q(tj7Var);
                return Unit.f46060a;
        }
    }
}
