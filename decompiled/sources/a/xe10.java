package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xe10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40722a;
    public final /* synthetic */ ze10 b;

    public /* synthetic */ xe10(ze10 ze10Var, byte b) {
        this.f40722a = b;
        this.b = ze10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40722a;
        ze10 ze10Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = ze10.Q1;
                fiu0 fiu0Var = ze10Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                htz htzVar2 = ze10.Q1;
                ((k3t0) ze10Var.M1.getValue()).x(le10.f19880a);
                return Unit.f46060a;
        }
    }
}
