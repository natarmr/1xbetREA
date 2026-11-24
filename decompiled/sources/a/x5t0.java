package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x5t0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ a6t0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5t0(a6t0 a6t0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a6t0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a6t0 a6t0Var = this.k;
        switch (b) {
            case 0:
                return new x5t0(a6t0Var, yjeVar, (byte) 0);
            case 1:
                x5t0 x5t0Var = new x5t0(a6t0Var, yjeVar, (byte) 1);
                x5t0Var.j = ((Boolean) obj).booleanValue();
                return x5t0Var;
            default:
                return new x5t0(a6t0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x5t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((x5t0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x5t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objW;
        Object value;
        Object value2;
        Object objA;
        Object value3;
        byte b = this.i;
        a6t0 a6t0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    dgu dguVar = a6t0Var.D;
                    String str = a6t0Var.q.f47171a;
                    this.j = true;
                    objW = dguVar.w(str, this);
                    if (objW == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW = obj;
                }
                q5t0 q5t0Var = (q5t0) objW;
                Object obj2 = q5t0Var.f28170a;
                e0g0 e0g0Var = j0g0.b;
                i6t0 i6t0Var = (i6t0) (obj2 instanceof g0g0 ? null : obj2);
                if (i6t0Var != null) {
                    htr0 htr0Var = new htr0(i6t0Var, q5t0Var, (byte) 23);
                    int i = a6t0.K;
                    a6t0Var.H(htr0Var);
                    return Unit.f46060a;
                }
                int i2 = a6t0.K;
                p7m0 p7m0Var = a6t0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, s5t0.a((s5t0) value, n5t0.c, null, null, null, null, null, null, null, null, false, 0L, 0L, 0L, 0L, 131069)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int i3 = a6t0.K;
                    a6t0Var.M();
                } else if (((s5t0) a6t0Var.D()).c == null) {
                    p7m0 p7m0Var2 = a6t0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, s5t0.a((s5t0) value2, n5t0.c, null, null, null, null, null, null, null, null, false, 0L, 0L, 0L, 0L, 131069)));
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    j3c j3cVar = a6t0Var.s;
                    this.j = true;
                    objA = j3cVar.a(189L, 0L, this);
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i4 = a6t0.K;
                p7m0 p7m0Var3 = a6t0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, s5t0.a((s5t0) value3, null, null, null, null, null, null, null, ypl0Var, null, false, 0L, 0L, 0L, 0L, 130559)));
                return Unit.f46060a;
        }
    }
}
