package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class dd7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kd7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd7(kd7 kd7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = kd7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kd7 kd7Var = this.j;
        switch (b) {
            case 0:
                return new dd7(kd7Var, yjeVar, (byte) 0);
            case 1:
                return new dd7(kd7Var, yjeVar, (byte) 1);
            default:
                return new dd7(kd7Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dd7) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        kd7 kd7Var = this.j;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = kd7.m0;
                kd7Var.Q();
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kd7 kd7Var2 = this.j;
                fvt0 fvt0Var = kd7Var2.J;
                mne mneVar = kd7Var2.r;
                String str = kd7Var2.o;
                if ((((rc7) kd7Var2.D()).d instanceof kzv) && ((rc7) kd7Var2.D()).f.equals(v760.f36909a)) {
                    sac.V(jiu0.a(kd7Var2), new ur6(1, kd7Var2, kd7.class, "errorHandle", "errorHandle(Ljava/lang/Throwable;)V", 0, (byte) 28), null, mneVar.b, new fd7(kd7Var2, yjeVar, (byte) 1), 10);
                } else if (!kd7Var2.B.i()) {
                    fvt0Var.x(Long.parseLong(str));
                    kd7Var2.G(bc7.f2340a);
                } else if (kd7Var2.I.a()) {
                    sac.V(jiu0.a(kd7Var2), new yc7(kd7Var2, (byte) 3), null, mneVar.b, new oa(kd7Var2, str, yjeVar, (byte) 24), 10);
                } else {
                    fvt0Var.x(Long.parseLong(str));
                    kd7Var2.G(gc7.f11045a);
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = kd7Var.h0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                kd7Var.h0 = sac.V(jiu0.a(kd7Var), new yc7(kd7Var, (byte) 13), null, kd7Var.r.b, new gd7(kd7Var, null), 10);
                break;
        }
        return Unit.f46060a;
    }
}
