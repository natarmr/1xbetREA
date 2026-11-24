package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tph0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34333a;
    public final /* synthetic */ xph0 b;

    public /* synthetic */ tph0(xph0 xph0Var, byte b) {
        this.f34333a = b;
        this.b = xph0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34333a;
        xph0 xph0Var = this.b;
        switch (b) {
            case 0:
                lme0 lme0Var = xph0.Q1;
                fiu0 fiu0Var = xph0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                lme0 lme0Var2 = xph0.Q1;
                ((k3t0) xph0Var.O1.getValue()).x(qph0.f29119a);
                return Unit.f46060a;
        }
    }
}
