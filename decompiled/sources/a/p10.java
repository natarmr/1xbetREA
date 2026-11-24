package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26177a;
    public final /* synthetic */ s10 b;

    public /* synthetic */ p10(s10 s10Var, byte b) {
        this.f26177a = b;
        this.b = s10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26177a;
        s10 s10Var = this.b;
        switch (b) {
            case 0:
                g6i g6iVar = s10Var.M1;
                if (g6iVar != null) {
                    return new t0h0(g6iVar, a4n0.f(s10Var));
                }
                Intrinsics.h("additionalVerificationStatusViewModelFactory");
                throw null;
            default:
                qek0 qek0Var = s10.Q1;
                s10Var.H0().x();
                return Unit.f46060a;
        }
    }
}
