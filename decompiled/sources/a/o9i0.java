package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o9i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24882a;
    public final /* synthetic */ t9i0 b;

    public /* synthetic */ o9i0(t9i0 t9i0Var, byte b) {
        this.f24882a = b;
        this.b = t9i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f24882a;
        yje yjeVar = null;
        t9i0 t9i0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = t9i0.Q1;
                cai0 cai0VarH0 = t9i0Var.H0();
                p7m0 p7m0Var = cai0VarH0.g;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.TRUE));
                sac.V(jiu0.a(cai0VarH0), new gwg0(cai0VarH0, (byte) 29), new a7g0(cai0VarH0, (byte) 27), null, new z8b0(cai0VarH0, yjeVar, (byte) 13), 12);
                return Unit.f46060a;
            case 1:
                kti ktiVar = t9i0Var.K1;
                if (ktiVar != null) {
                    return new q0h0(ktiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = t9i0.Q1;
                return q3d.j(t9i0Var.G0().c, t9i0Var.G0().d, t9i0Var.G0().h, t9i0Var.G0().g, t9i0Var.G0().e);
        }
    }
}
