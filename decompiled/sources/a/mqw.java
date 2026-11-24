package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class mqw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qqw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mqw(qqw qqwVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qqwVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qqw qqwVar = this.k;
        switch (b) {
            case 0:
                mqw mqwVar = new mqw(qqwVar, yjeVar, (byte) 0);
                mqwVar.j = ((Boolean) obj).booleanValue();
                return mqwVar;
            case 1:
                return new mqw(qqwVar, yjeVar, (byte) 1);
            default:
                return new mqw(qqwVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mqw) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mqw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mqw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        dqw dqwVar;
        Object value2;
        byte b = this.i;
        qqw qqwVar = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && (((dqw) qqwVar.D()).f6533a || ((dqw) qqwVar.D()).b)) {
                    bby bbyVar = qqwVar.y;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    qqwVar.y = sac.Z(jiu0.a(qqwVar), ibc.w0(30L, bfn.SECONDS), qqwVar.w.b, pqw.f27436a, new mqw(qqwVar, yjeVar, b2));
                    qqwVar.M(false);
                } else {
                    int i = qqw.A;
                    p7m0 p7m0Var = qqwVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        dqwVar = (dqw) value;
                        qqwVar.f.getClass();
                    } while (!p7m0Var.m(value, dqw.a(dqwVar, false, dqwVar.h.isEmpty(), false, null, null, null, null, null, null, 1020)));
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar = qqwVar.s;
                    String str = qqwVar.o;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar2) {
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
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = qqw.A;
                p7m0 p7m0Var2 = qqwVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, dqw.a((dqw) value2, true, false, false, null, null, null, null, null, null, 1022)));
                return Unit.f46060a;
        }
    }
}
