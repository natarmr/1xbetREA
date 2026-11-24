package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kau0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17983a;
    public final /* synthetic */ mau0 b;

    public /* synthetic */ kau0(mau0 mau0Var, byte b) {
        this.f17983a = b;
        this.b = mau0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17983a;
        mau0 mau0Var = this.b;
        switch (b) {
            case 0:
                azi aziVar = mau0Var.L1;
                if (aziVar != null) {
                    return new t0h0(aziVar, a4n0.f(mau0Var));
                }
                Intrinsics.h("verificationStatusViewModelFactory");
                throw null;
            default:
                bzs0 bzs0Var = mau0.Q1;
                mau0Var.H0().y(mau0Var.O1.n(mau0Var, mau0.R1[1]).booleanValue());
                return Unit.f46060a;
        }
    }
}
