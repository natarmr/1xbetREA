package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a6a0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d6a0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6a0(d6a0 d6a0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d6a0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d6a0 d6a0Var = this.k;
        switch (b) {
            case 0:
                return new a6a0(d6a0Var, yjeVar, (byte) 0);
            default:
                a6a0 a6a0Var = new a6a0(d6a0Var, yjeVar, (byte) 1);
                a6a0Var.j = ((Boolean) obj).booleanValue();
                return a6a0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a6a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a6a0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        d6a0 d6a0Var = this.k;
        boolean z = true;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    f4u f4uVar = d6a0Var.p;
                    String str = d6a0Var.r;
                    this.j = true;
                    y3v y3vVar = (y3v) f4uVar.b;
                    obj = qjj.d0(((mne) y3vVar.d).b, new oed(y3vVar, str, null, (byte) 13), this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                h8a0 h8a0Var = (h8a0) obj;
                int i = d6a0.C;
                p7m0 p7m0Var = d6a0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, v5a0.a((v5a0) value, null, false, false, h8a0Var.g.isEmpty(), h8a0Var, 33)));
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = !z3 && ((v5a0) d6a0Var.D()).b;
                if (!z3 || (!((v5a0) d6a0Var.D()).c && !((v5a0) d6a0Var.D()).d)) {
                    z = false;
                }
                if (z4 || z) {
                    int i2 = d6a0.C;
                    d6a0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
