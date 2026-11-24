package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pnp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qnp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnp0(qnp0 qnp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qnp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qnp0 qnp0Var = this.k;
        switch (b) {
            case 0:
                return new pnp0(qnp0Var, yjeVar, (byte) 0);
            default:
                pnp0 pnp0Var = new pnp0(qnp0Var, yjeVar, (byte) 1);
                pnp0Var.j = ((Boolean) obj).booleanValue();
                return pnp0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pnp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pnp0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        qnp0 qnp0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xfu xfuVar = qnp0Var.q;
                    String str = qnp0Var.p;
                    this.j = true;
                    ywu ywuVar = (ywu) xfuVar.f40810a;
                    obj = qjj.d0(((mne) ywuVar.c).b, new oed(ywuVar, str, null, (byte) 28), this);
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
                List list = (List) obj;
                int i = qnp0.w;
                p7m0 p7m0Var = qnp0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, knp0.a((knp0) value, false, false, list, 0, 49)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((knp0) qnp0Var.D()).b;
                boolean z4 = z2 && ((knp0) qnp0Var.D()).c;
                if (z3 || z4) {
                    int i2 = qnp0.w;
                    qnp0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
