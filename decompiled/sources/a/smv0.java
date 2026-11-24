package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class smv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ tmv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ smv0(tmv0 tmv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tmv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tmv0 tmv0Var = this.k;
        switch (b) {
            case 0:
                return new smv0(tmv0Var, yjeVar, (byte) 0);
            default:
                smv0 smv0Var = new smv0(tmv0Var, yjeVar, (byte) 1);
                smv0Var.j = ((Boolean) obj).booleanValue();
                return smv0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((smv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((smv0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        tmv0 tmv0Var = this.k;
        boolean z = true;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    n4u n4uVar = tmv0Var.o;
                    String str = tmv0Var.s;
                    this.j = true;
                    gxu gxuVar = (gxu) n4uVar.b;
                    obj = qjj.d0(((mne) gxuVar.c).b, new oed(gxuVar, str, null, (byte) 9), this);
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
                vk90 vk90Var = (vk90) obj;
                int i = tmv0.v;
                p7m0 p7m0Var = tmv0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, mmv0.a((mmv0) value, false, false, vk90Var instanceof uk90, vk90Var, 16)));
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = !z3 && ((mmv0) tmv0Var.D()).f22062a;
                if (!z3 || (!((mmv0) tmv0Var.D()).b && !((mmv0) tmv0Var.D()).c)) {
                    z = false;
                }
                if (z4 || z) {
                    int i2 = tmv0.v;
                    tmv0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
