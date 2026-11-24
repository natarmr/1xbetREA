package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nqc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23953a;
    public final /* synthetic */ pqc0 b;

    public /* synthetic */ nqc0(pqc0 pqc0Var, byte b) {
        this.f23953a = b;
        this.b = pqc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23953a;
        pqc0 pqc0Var = this.b;
        switch (b) {
            case 0:
                fqi fqiVar = pqc0Var.K1;
                if (fqiVar != null) {
                    return new q0h0(fqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                mi70 mi70Var = pqc0.Q1;
                ((k3t0) pqc0Var.N1.getValue()).x(kqc0.f18717a);
                return Unit.f46060a;
        }
    }
}
