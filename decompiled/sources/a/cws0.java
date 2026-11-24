package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class cws0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dws0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cws0(dws0 dws0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dws0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dws0 dws0Var = this.k;
        switch (b) {
            case 0:
                return new cws0(dws0Var, yjeVar, (byte) 0);
            default:
                cws0 cws0Var = new cws0(dws0Var, yjeVar, (byte) 1);
                cws0Var.j = ((Boolean) obj).booleanValue();
                return cws0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cws0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cws0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        dws0 dws0Var = this.k;
        switch (b) {
            case 0:
                p7m0 p7m0Var = dws0Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, bws0.a((bws0) value, true, null, null, null, false, false, 62)));
                    im4 im4Var = dws0Var.h;
                    wl4 wl4Var = new wl4(((bws0) p7m0Var.getValue()).c);
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(wl4Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                dws0Var.j.f(new xvs0(qvs0.f29402a));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = dws0Var.i;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, bws0.a((bws0) value2, false, null, null, null, false, z2, 31)));
                return Unit.f46060a;
        }
    }
}
