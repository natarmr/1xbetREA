package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class zar extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ abr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zar(abr abrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = abrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        abr abrVar = this.k;
        switch (b) {
            case 0:
                zar zarVar = new zar(abrVar, yjeVar, (byte) 0);
                zarVar.j = ((Boolean) obj).booleanValue();
                return zarVar;
            default:
                return new zar(abrVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zar) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zar) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        rar rarVar;
        Object value2;
        byte b = this.i;
        abr abrVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && (((rar) abrVar.D()).f30150a || ((rar) abrVar.D()).b)) {
                    abrVar.M(false);
                } else {
                    int i = abr.v;
                    p7m0 p7m0Var = abrVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        rarVar = (rar) value;
                        abrVar.f.getClass();
                    } while (!p7m0Var.m(value, rar.a(rarVar, false, rarVar.d.isEmpty(), false, 12)));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = abr.v;
                p7m0 p7m0Var2 = abrVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, rar.a((rar) value2, true, false, false, 14)));
                return Unit.f46060a;
        }
    }
}
