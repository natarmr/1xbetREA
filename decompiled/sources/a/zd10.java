package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zd10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ be10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd10(be10 be10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = be10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        be10 be10Var = this.k;
        switch (b) {
            case 0:
                return new zd10(be10Var, yjeVar, (byte) 0);
            default:
                zd10 zd10Var = new zd10(be10Var, yjeVar, (byte) 1);
                zd10Var.j = ((Boolean) obj).booleanValue();
                return zd10Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zd10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zd10) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        be10 be10Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (be10Var.z) {
                        hcp0 hcp0Var = be10Var.t;
                        this.j = true;
                        if (hcp0Var.q(this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                be10Var.z = z2;
                if (z2) {
                    be10Var.M();
                } else {
                    p7m0 p7m0Var = be10Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, td10.a((td10) value, null, false, true, 3)));
                }
                return Unit.f46060a;
        }
    }
}
