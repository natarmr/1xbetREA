package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gzh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12178a;
    public final /* synthetic */ izh0 b;

    public /* synthetic */ gzh0(izh0 izh0Var, byte b) {
        this.f12178a = b;
        this.b = izh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12178a;
        izh0 izh0Var = this.b;
        switch (b) {
            case 0:
                lme0 lme0Var = izh0.S1;
                izh0Var.G0().x(syh0.f33023a);
                return Unit.f46060a;
            case 1:
                lme0 lme0Var2 = izh0.S1;
                fiu0 fiu0Var = izh0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                lme0 lme0Var3 = izh0.S1;
                izh0Var.G0().x(wyh0.f39973a);
                return Unit.f46060a;
            default:
                lme0 lme0Var4 = izh0.S1;
                izh0Var.G0().x(vyh0.f38248a);
                return Unit.f46060a;
        }
    }
}
