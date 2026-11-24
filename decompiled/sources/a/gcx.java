package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class gcx extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hcx k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcx(hcx hcxVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hcxVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hcx hcxVar = this.k;
        switch (b) {
            case 0:
                gcx gcxVar = new gcx(hcxVar, yjeVar, (byte) 0);
                gcxVar.j = ((Boolean) obj).booleanValue();
                return gcxVar;
            default:
                return new gcx(hcxVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((gcx) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gcx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        hcx hcxVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((acx) hcxVar.D()).f652a || (z && (((acx) hcxVar.D()).c || ((acx) hcxVar.D()).b))) {
                    hcxVar.M(false);
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
                int i = hcx.v;
                p7m0 p7m0Var = hcxVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, acx.a((acx) value, true, false, 14)));
                return Unit.f46060a;
        }
    }
}
