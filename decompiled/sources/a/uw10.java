package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class uw10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ cx10 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw10(cx10 cx10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = cx10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cx10 cx10Var = this.j;
        switch (b) {
            case 0:
                return new uw10(cx10Var, yjeVar, (byte) 0);
            case 1:
                return new uw10(cx10Var, yjeVar, (byte) 1);
            case 2:
                return new uw10(cx10Var, yjeVar, (byte) 2);
            default:
                return new uw10(cx10Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uw10) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((uw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((uw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((uw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jw10 jw10Var = jw10.f17230a;
        cx10 cx10Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                cx10 cx10Var2 = this.j;
                mne mneVar = cx10Var2.f;
                byte b2 = 1;
                yje yjeVar = null;
                if (cx10Var2.P) {
                    sac.V(jiu0.a(cx10Var2), new pf10(1, cx10Var2, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, mneVar.b, new uw10(cx10Var2, yjeVar, b2), 10);
                }
                if (cx10Var2.Q) {
                    sac.V(jiu0.a(cx10Var2), new pf10(1, cx10Var2, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.b, new uw10(cx10Var2, yjeVar, (byte) 2), 10);
                    cx10Var2.b.e("open_bot", Boolean.FALSE);
                    cx10Var2.Q = false;
                }
                cx10Var2.K = sac.T(new fnq(cx10Var2.t.a(), new fw10(cx10Var2, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(cx10Var2), mneVar.f22085a), new dm10(2, cx10Var2, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 20));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                cx10Var.G.f(jw10Var);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                cx10Var.G.f(mw10.f22482a);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                cx10Var.G.f(jw10Var);
                break;
        }
        return Unit.f46060a;
    }
}
