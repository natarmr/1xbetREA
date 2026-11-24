package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j6f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15983a;
    public final /* synthetic */ m6f0 b;

    public /* synthetic */ j6f0(m6f0 m6f0Var, byte b) {
        this.f15983a = b;
        this.b = m6f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        byte b = this.f15983a;
        m6f0 m6f0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = m6f0.f2;
                m6f0Var.L0().x(f6f0.f9007a);
                return Unit.f46060a;
            case 1:
                fiu0 fiu0Var = m6f0Var.Y1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                gle0 gle0Var2 = m6f0.f2;
                m6f0Var.L0().x(b6f0.f2051a);
                return Unit.f46060a;
        }
    }
}
