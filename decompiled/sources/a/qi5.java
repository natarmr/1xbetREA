package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qi5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28773a;
    public final /* synthetic */ si5 b;

    public /* synthetic */ qi5(si5 si5Var, byte b) {
        this.f28773a = b;
        this.b = si5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28773a;
        si5 si5Var = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = si5.Q1;
                si5Var.G0().x(x1k0.f40126a);
                return Unit.f46060a;
            case 1:
                hfk0 hfk0Var2 = si5.Q1;
                fiu0 fiu0Var = si5Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                hfk0 hfk0Var3 = si5.Q1;
                si5Var.G0().x(w1k0.f38405a);
                return Unit.f46060a;
            default:
                hfk0 hfk0Var4 = si5.Q1;
                si5Var.G0().x(u1k0.f34904a);
                return Unit.f46060a;
        }
    }
}
