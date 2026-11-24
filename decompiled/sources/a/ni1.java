package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ni1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23562a;
    public final /* synthetic */ qi1 b;

    public /* synthetic */ ni1(qi1 qi1Var, byte b) {
        this.f23562a = b;
        this.b = qi1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23562a;
        qi1 qi1Var = this.b;
        switch (b) {
            case 0:
                m7i m7iVar = qi1Var.N1;
                if (m7iVar != null) {
                    return new q0h0(m7iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                pek0 pek0Var = qi1.P1;
                qi1Var.G0().x(wh1.f39143a);
                return Unit.f46060a;
        }
    }
}
