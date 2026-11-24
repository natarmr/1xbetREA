package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h9i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12678a;
    public final /* synthetic */ m9i0 b;

    public /* synthetic */ h9i0(m9i0 m9i0Var, byte b) {
        this.f12678a = b;
        this.b = m9i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f12678a;
        yje yjeVar = null;
        m9i0 m9i0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = m9i0.S1;
                jai0 jai0VarH0 = m9i0Var.H0();
                p7m0 p7m0Var = jai0VarH0.h;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.TRUE));
                sac.V(jiu0.a(jai0VarH0), new dai0(jai0VarH0, (byte) 0), new eai0(jai0VarH0, (byte) 0), null, new z8b0(jai0VarH0, yjeVar, (byte) 14), 12);
                return Unit.f46060a;
            case 1:
                iti itiVar = m9i0Var.M1;
                if (itiVar != null) {
                    return new q0h0(itiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                eke0 eke0Var2 = m9i0.S1;
                return q3d.j(m9i0Var.G0().c, m9i0Var.G0().j, m9i0Var.G0().d, m9i0Var.G0().h);
        }
    }
}
