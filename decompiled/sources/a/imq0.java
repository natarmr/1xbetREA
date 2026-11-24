package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class imq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15038a;
    public final /* synthetic */ nmq0 b;

    public /* synthetic */ imq0(nmq0 nmq0Var, byte b) {
        this.f15038a = b;
        this.b = nmq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15038a;
        yje yjeVar = null;
        nmq0 nmq0Var = this.b;
        switch (b) {
            case 0:
                ixi ixiVar = nmq0Var.K1;
                if (ixiVar != null) {
                    return new q0h0(ixiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr = nmq0.Q1;
                return q3d.j(nmq0Var.G0().c, nmq0Var.G0().g, nmq0Var.G0().d);
            default:
                iiy[] iiyVarArr2 = nmq0.Q1;
                wmq0 wmq0VarH0 = nmq0Var.H0();
                sac.V(jiu0.a(wmq0VarH0), new nop0(wmq0VarH0, (byte) 20), new h3q0(wmq0VarH0, (byte) 15), null, new vmq0(wmq0VarH0, yjeVar, (byte) 0), 12);
                return Unit.f46060a;
        }
    }
}
