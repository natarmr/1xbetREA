package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15706a;
    public final /* synthetic */ m10 b;

    public /* synthetic */ j10(m10 m10Var, byte b) {
        this.f15706a = b;
        this.b = m10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15706a;
        m10 m10Var = this.b;
        switch (b) {
            case 0:
                e6i e6iVar = m10Var.M1;
                if (e6iVar != null) {
                    return new q0h0(e6iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                pek0 pek0Var = m10.P1;
                m10Var.G0().x(z00.f43541a);
                return Unit.f46060a;
            default:
                pek0 pek0Var2 = m10.P1;
                m10Var.G0().x(a10.f45a);
                return Unit.f46060a;
        }
    }
}
