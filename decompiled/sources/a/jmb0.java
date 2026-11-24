package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class jmb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pmb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmb0(pmb0 pmb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pmb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pmb0 pmb0Var = this.k;
        switch (b) {
            case 0:
                jmb0 jmb0Var = new jmb0(pmb0Var, yjeVar, (byte) 0);
                jmb0Var.j = obj;
                return jmb0Var;
            case 1:
                jmb0 jmb0Var2 = new jmb0(pmb0Var, yjeVar, (byte) 1);
                jmb0Var2.j = obj;
                return jmb0Var2;
            case 2:
                jmb0 jmb0Var3 = new jmb0(pmb0Var, yjeVar, (byte) 2);
                jmb0Var3.j = obj;
                return jmb0Var3;
            default:
                jmb0 jmb0Var4 = new jmb0(pmb0Var, yjeVar, (byte) 3);
                jmb0Var4.j = obj;
                return jmb0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jmb0) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jmb0) create((skb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jmb0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jmb0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        olb0 olb0Var;
        bib0 bib0Var;
        byte b = this.i;
        pmb0 pmb0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = pmb0.D0;
                p7m0 p7m0Var = pmb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, olb0.a((olb0) value, null, null, ql5Var, false, false, null, 0L, 0L, false, null, null, null, 8187)));
                break;
            case 1:
                skb0 skb0Var = (skb0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = pmb0.D0;
                p7m0 p7m0Var2 = pmb0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, olb0.a((olb0) value2, null, null, null, false, false, null, 0L, 0L, false, null, null, skb0Var, 6143)));
                break;
            case 2:
                String str = (String) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = pmb0.D0;
                p7m0 p7m0Var3 = pmb0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, olb0.a((olb0) value3, null, null, null, false, false, str, 0L, 0L, false, null, null, null, 8159)));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i4 = pmb0.D0;
                p7m0 p7m0Var4 = pmb0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    olb0Var = (olb0) value4;
                    bib0Var = olb0Var.k;
                    uaq0.f35345a.getClass();
                } while (!p7m0Var4.m(value4, olb0.a(olb0Var, null, null, null, false, false, null, 0L, 0L, false, null, bib0.a(bib0Var, s9m0.l(uaq0Var), false, 33554430), null, 7167)));
                break;
        }
        return Unit.f46060a;
    }
}
