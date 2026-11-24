package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pit extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sit k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pit(sit sitVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sitVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sit sitVar = this.k;
        switch (b) {
            case 0:
                return new pit(sitVar, yjeVar, (byte) 0);
            default:
                pit pitVar = new pit(sitVar, yjeVar, (byte) 1);
                pitVar.j = ((Boolean) obj).booleanValue();
                return pitVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pit) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pit) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        sit sitVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = sit.G;
                    if (sitVar.N(this) == wneVar) {
                        return wneVar;
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
                if (z2 && ((zht) sitVar.D()).g) {
                    sitVar.O();
                } else if (!z2 && ((zht) sitVar.D()).f) {
                    bby bbyVar = sitVar.E;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    p7m0 p7m0Var = sitVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        sitVar.f.getClass();
                    } while (!p7m0Var.m(value, zht.a((zht) value, null, null, false, null, null, false, true, null, null, 927)));
                }
                return Unit.f46060a;
        }
    }
}
