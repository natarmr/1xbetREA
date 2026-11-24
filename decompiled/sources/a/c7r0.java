package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c7r0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g7r0 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7r0(g7r0 g7r0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g7r0Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        g7r0 g7r0Var = this.k;
        switch (b) {
            case 0:
                return new c7r0(g7r0Var, z, yjeVar, (byte) 0);
            default:
                return new c7r0(g7r0Var, z, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((c7r0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        boolean z = this.l;
        g7r0 g7r0Var = this.k;
        byte b2 = 0;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    boolean z3 = ((w6r0) g7r0Var.D()).w || z;
                    p7m0 p7m0Var = g7r0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, w6r0.a((w6r0) value, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 4194303)));
                    wdu wduVar = g7r0Var.u;
                    Boolean bool = ((w6r0) g7r0Var.D()).l;
                    utb utbVarS = wduVar.s(z3, z3, bool != null ? bool.booleanValue() : g7r0Var.s.a().J1, null);
                    b7r0 b7r0Var = new b7r0(g7r0Var, b2);
                    this.j = true;
                    if (utbVarS.c(b7r0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    boolean z5 = ((w6r0) g7r0Var.D()).w || z;
                    p7m0 p7m0Var2 = g7r0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, w6r0.a((w6r0) value2, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, false, 4194303)));
                    zpu zpuVar = g7r0Var.t;
                    Boolean bool2 = ((w6r0) g7r0Var.D()).l;
                    utb utbVarC = aoq.c(((m8l0) ((lef0) ((xsu) zpuVar.c).f41434a).f19899a).f21376a, new d2v(null, zpuVar, z5, z5, bool2 != null ? bool2.booleanValue() : g7r0Var.s.a().J1));
                    b7r0 b7r0Var2 = new b7r0(g7r0Var, b3);
                    this.j = true;
                    if (utbVarC.c(b7r0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
