package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c85 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g85 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c85(g85 g85Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g85Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g85 g85Var = this.k;
        switch (b) {
            case 0:
                c85 c85Var = new c85(g85Var, yjeVar, (byte) 0);
                c85Var.j = obj;
                return c85Var;
            default:
                c85 c85Var2 = new c85(g85Var, yjeVar, (byte) 1);
                c85Var2.j = obj;
                return c85Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((c85) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c85) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        g85 g85Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0((List) obj2, (byte) 8);
                int i = g85.A;
                g85Var.H(bo0Var);
                break;
            default:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.f32897a) {
                    int i2 = g85.A;
                    g85Var.O();
                }
                int i3 = g85.A;
                p7m0 p7m0Var = g85Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, s75.a((s75) value, null, sw00Var.f32897a, false, 27)));
                break;
        }
        return Unit.f46060a;
    }
}
