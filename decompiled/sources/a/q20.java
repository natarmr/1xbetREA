package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class q20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ s20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q20(s20 s20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s20 s20Var = this.k;
        switch (b) {
            case 0:
                return new q20(s20Var, yjeVar, (byte) 0);
            default:
                q20 q20Var = new q20(s20Var, yjeVar, (byte) 1);
                q20Var.j = ((Boolean) obj).booleanValue();
                return q20Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((q20) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        bby bbyVar;
        byte b = this.i;
        s20 s20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    List list = s20.J;
                    obj = s20Var.M(true, this);
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
                cau0 cau0Var = (cau0) obj;
                List list2 = s20.J;
                p7m0 p7m0Var = s20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, k20.a((k20) value, cau0Var, null, 61)));
                if (!s20.J.contains(((k20) s20Var.D()).b) && (bbyVar = s20Var.H) != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((k20) s20Var.D()).c == e10.f7015a;
                boolean z4 = z2 && ((k20) s20Var.D()).c == e10.c;
                if (z3 || z4) {
                    List list3 = s20.J;
                    s20Var.N();
                }
                return Unit.f46060a;
        }
    }
}
