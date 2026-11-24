package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xkp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ykp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xkp0(ykp0 ykp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ykp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ykp0 ykp0Var = this.k;
        switch (b) {
            case 0:
                return new xkp0(ykp0Var, yjeVar, (byte) 0);
            default:
                xkp0 xkp0Var = new xkp0(ykp0Var, yjeVar, (byte) 1);
                xkp0Var.j = ((Boolean) obj).booleanValue();
                return xkp0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xkp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((xkp0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        ykp0 ykp0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    svu svuVar = ykp0Var.p;
                    String str = ykp0Var.t;
                    this.j = true;
                    nvu nvuVar = (nvu) svuVar.f32888a;
                    obj = qjj.d0(((mne) nvuVar.d).b, new oed(nvuVar, str, null, (byte) 26), this);
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
                kkp0 kkp0Var = (kkp0) obj;
                int i = ykp0.y;
                p7m0 p7m0Var = ykp0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, qkp0.a((qkp0) value, kkp0Var.f18453a, false, false, kkp0Var, 0L, 16)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((qkp0) ykp0Var.D()).b;
                boolean z4 = z2 && ((qkp0) ykp0Var.D()).c;
                if (z3 || z4) {
                    int i2 = ykp0.y;
                    ykp0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
