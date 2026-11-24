package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class irw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ krw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ irw(krw krwVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = krwVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        krw krwVar = this.k;
        switch (b) {
            case 0:
                irw irwVar = new irw(krwVar, yjeVar, (byte) 0);
                irwVar.j = ((Boolean) obj).booleanValue();
                return irwVar;
            default:
                return new irw(krwVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((irw) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((irw) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        crw crwVar;
        Object value2;
        byte b = this.i;
        krw krwVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && (((crw) krwVar.D()).f4864a || ((crw) krwVar.D()).b)) {
                    krwVar.M(false);
                } else {
                    int i = krw.v;
                    p7m0 p7m0Var = krwVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        crwVar = (crw) value;
                        krwVar.f.getClass();
                    } while (!p7m0Var.m(value, crw.a(crwVar, false, crwVar.d.isEmpty(), false, null, false, 28)));
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
                int i2 = krw.v;
                p7m0 p7m0Var2 = krwVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, crw.a((crw) value2, true, false, false, null, false, 30)));
                return Unit.f46060a;
        }
    }
}
