package a;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hk20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ on20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk20(on20 on20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = on20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                return new hk20(on20Var, yjeVar, (byte) 0);
            case 1:
                return new hk20(on20Var, yjeVar, (byte) 1);
            case 2:
                return new hk20(on20Var, yjeVar, (byte) 2);
            default:
                hk20 hk20Var = new hk20(on20Var, yjeVar, (byte) 3);
                hk20Var.j = ((Boolean) obj).booleanValue();
                return hk20Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((hk20) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = on20.m1;
                    on20 on20Var2 = this.k;
                    on20Var2.E0();
                    hx4 hx4Var = ((a820) on20Var2.D()).g;
                    bx6 bx6Var = hx4Var.c;
                    BigDecimal bigDecimal = hx4Var.b.f43459a;
                    double d = bx6Var.b.f34633a;
                    double dDoubleValue = bigDecimal.doubleValue();
                    String str = bx6Var.b.f;
                    Double d2 = new Double(bigDecimal.doubleValue());
                    ngz ngzVar = new ngz(on20Var2, hx4Var, (byte) 15);
                    this.j = true;
                    if (on20Var2.V(d, dDoubleValue, str, d2, false, ngzVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = on20.m1;
                    on20 on20Var3 = this.k;
                    on20Var3.E0();
                    tw6 tw6Var = ((a820) on20Var3.D()).e.f27665a.b;
                    double d3 = tw6Var.f34633a;
                    double dG0 = on20Var3.g0(on20Var3.X.i());
                    String str2 = tw6Var.f;
                    p0z p0zVar = new p0z(on20Var3, (byte) 9);
                    this.j = true;
                    if (on20Var3.V(d3, dG0, str2, null, true, p0zVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    tqc tqcVar = on20Var.G0;
                    this.j = true;
                    if (tqcVar.b(false, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = on20.m1;
                p7m0 p7m0Var = on20Var.i.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    boolean z5 = z4;
                    if (p7m0Var.m(value, a820.a((a820) value, null, null, null, null, null, null, null, false, null, 0.0f, false, null, 0, z5, false, false, 245759))) {
                        if (z5) {
                            on20Var.R0();
                        }
                        return Unit.f46060a;
                    }
                    z4 = z5;
                }
                break;
        }
    }
}
