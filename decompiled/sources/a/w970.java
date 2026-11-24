package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w970 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38766a;
    public final /* synthetic */ ca70 b;

    public /* synthetic */ w970(ca70 ca70Var, byte b) {
        this.f38766a = b;
        this.b = ca70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38766a;
        ca70 ca70Var = this.b;
        switch (b) {
            case 0:
                smi smiVar = ca70Var.K1;
                if (smiVar != null) {
                    return new q0h0(smiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                htz htzVar = ca70.U1;
                ca70Var.H0().x(k770.f17806a);
                return Unit.f46060a;
            case 2:
                htz htzVar2 = ca70.U1;
                ca70Var.H0().x(h770.f12563a);
                return Unit.f46060a;
            case 3:
                htz htzVar3 = ca70.U1;
                ca70Var.H0().x(g770.f10803a);
                return Unit.f46060a;
            case 4:
                htz htzVar4 = ca70.U1;
                ca70Var.H0().x(u770.f35171a);
                k3t0 k3t0VarH0 = ca70Var.H0();
                k3t0VarH0.getClass();
                if (((xb70) ((xd70) k3t0VarH0).D()).m) {
                    ca70Var.I0(true);
                }
                return Unit.f46060a;
            case 5:
                htz htzVar5 = ca70.U1;
                ca70Var.H0().x(t770.f33453a);
                return Unit.f46060a;
            case 6:
                htz htzVar6 = ca70.U1;
                ca70Var.H0().x(d770.f5582a);
                return Unit.f46060a;
            case 7:
                htz htzVar7 = ca70.U1;
                ca70Var.H0().x(w770.f38659a);
                return Unit.f46060a;
            case 8:
                htz htzVar8 = ca70.U1;
                return new aa70(ca70Var);
            case 9:
                htz htzVar9 = ca70.U1;
                ca70Var.H0().x(n770.f23028a);
                return Unit.f46060a;
            case 10:
                htz htzVar10 = ca70.U1;
                ca70Var.H0().x(a770.f352a);
                return Unit.f46060a;
            case 11:
                htz htzVar11 = ca70.U1;
                ca70Var.H0().x(z670.f43853a);
                return Unit.f46060a;
            case 12:
                htz htzVar12 = ca70.U1;
                ca70Var.H0().x(z770.f43904a);
                return Unit.f46060a;
            case 13:
                htz htzVar13 = ca70.U1;
                ca70Var.H0().x(f770.f9046a);
                return Unit.f46060a;
            default:
                htz htzVar14 = ca70.U1;
                ca70Var.H0().x(v770.f36911a);
                return Unit.f46060a;
        }
    }
}
