package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qn2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yn2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn2(yn2 yn2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yn2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yn2 yn2Var = this.k;
        switch (b) {
            case 0:
                return new qn2(yn2Var, yjeVar, (byte) 0);
            default:
                qn2 qn2Var = new qn2(yn2Var, yjeVar, (byte) 1);
                qn2Var.j = ((Boolean) obj).booleanValue();
                return qn2Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qn2) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qn2) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        byte b = this.i;
        yn2 yn2Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    oif0 oif0Var = yn2Var.B;
                    this.j = true;
                    if (oif0Var.z(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                v3c.N(yn2Var.a0);
                yn2Var.M();
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = yn2.g0;
                p7m0 p7m0Var = yn2Var.i.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    boolean z3 = z2;
                    if (p7m0Var.m(value, xm2.a((xm2) value, false, false, false, null, null, null, false, false, false, false, false, z3, 131071))) {
                        if (z3 && ((xm2) yn2Var.D()).d.isEmpty()) {
                            yn2Var.M();
                        } else if (z3 && ((bbyVar = yn2Var.a0) == null || !bbyVar.isActive())) {
                            yn2Var.M();
                        } else if (!z3) {
                            yn2Var.O(true);
                        }
                        return Unit.f46060a;
                    }
                    z2 = z3;
                }
                break;
        }
    }
}
