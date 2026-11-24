package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ybr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ecr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ybr0(ecr0 ecr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ecr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ecr0 ecr0Var = this.k;
        switch (b) {
            case 0:
                return new ybr0(ecr0Var, yjeVar, (byte) 0);
            case 1:
                return new ybr0(ecr0Var, yjeVar, (byte) 1);
            case 2:
                return new ybr0(ecr0Var, yjeVar, (byte) 2);
            case 3:
                ybr0 ybr0Var = new ybr0(ecr0Var, yjeVar, (byte) 3);
                ybr0Var.j = ((Boolean) obj).booleanValue();
                return ybr0Var;
            default:
                return new ybr0(ecr0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ybr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ybr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ybr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ybr0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ybr0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        ecr0 ecr0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    yfu yfuVar = ecr0Var.q;
                    String str = ecr0Var.o;
                    this.j = true;
                    y3v y3vVar = (y3v) yfuVar.f42558a;
                    obj = qjj.d0(((mne) y3vVar.b).b, new oed(y3vVar, str, yjeVar, (byte) 21), this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                jjy jjyVar = (jjy) obj;
                int i = ecr0.E;
                p7m0 p7m0Var = ecr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, tbr0.a((tbr0) value, null, null, null, false, false, false, jjyVar, 39)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar = ecr0Var.v;
                    String str2 = ecr0Var.o;
                    this.j = true;
                    if (jwuVar.b(str2, this) == wneVar2) {
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
                    jwu jwuVar2 = ecr0Var.v;
                    String str3 = ecr0Var.o;
                    this.j = true;
                    if (jwuVar2.b(str3, this) == wneVar3) {
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
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = !z4 && ((tbr0) ecr0Var.D()).d;
                boolean z6 = z4 && ((tbr0) ecr0Var.D()).e;
                if (z5 || z6) {
                    int i2 = ecr0.E;
                    ecr0Var.N();
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bby bbyVar = ecr0Var.B;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ecr0Var.B = null;
                return Unit.f46060a;
        }
    }
}
