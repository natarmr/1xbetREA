package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class we7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39005a;
    public final /* synthetic */ ze7 b;

    public /* synthetic */ we7(ze7 ze7Var, byte b) {
        this.f39005a = b;
        this.b = ze7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39005a;
        ze7 ze7Var = this.b;
        switch (b) {
            case 0:
                cl5 cl5Var = ze7.P1;
                ze7Var.G0().x(qe7.f28568a);
                return Unit.f46060a;
            default:
                aai aaiVar = ze7Var.K1;
                if (aaiVar != null) {
                    return new q0h0(aaiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
