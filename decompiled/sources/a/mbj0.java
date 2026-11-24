package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mbj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21513a;
    public final /* synthetic */ qbj0 b;

    public /* synthetic */ mbj0(qbj0 qbj0Var, byte b) {
        this.f21513a = b;
        this.b = qbj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21513a;
        qbj0 qbj0Var = this.b;
        switch (b) {
            case 0:
                lme0 lme0Var = qbj0.Z1;
                qbj0Var.H0().x(laj0.f19708a);
                return Unit.f46060a;
            case 1:
                lme0 lme0Var2 = qbj0.Z1;
                qbj0Var.H0().x(xaj0.f40558a);
                return Unit.f46060a;
            case 2:
                lme0 lme0Var3 = qbj0.Z1;
                qbj0Var.H0().x(paj0.f26658a);
                return Unit.f46060a;
            case 3:
                lme0 lme0Var4 = qbj0.Z1;
                qbj0Var.H0().x(qaj0.f28397a);
                return Unit.f46060a;
            case 4:
                tti ttiVar = qbj0Var.U1;
                if (ttiVar != null) {
                    return new q0h0(ttiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                lme0 lme0Var5 = qbj0.Z1;
                qbj0Var.H0().x(jaj0.f16192a);
                return Unit.f46060a;
            case 6:
                lme0 lme0Var6 = qbj0.Z1;
                qbj0Var.H0().x(oaj0.f24930a);
                return Unit.f46060a;
            case 7:
                lme0 lme0Var7 = qbj0.Z1;
                qbj0Var.H0().x(yaj0.f42302a);
                return Unit.f46060a;
            case 8:
                lme0 lme0Var8 = qbj0.Z1;
                qbj0Var.H0().x(naj0.f23194a);
                return Unit.f46060a;
            default:
                lme0 lme0Var9 = qbj0.Z1;
                qbj0Var.H0().x(zaj0.f44072a);
                return Unit.f46060a;
        }
    }
}
