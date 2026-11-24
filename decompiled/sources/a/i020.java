package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i020 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ l020 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i020(l020 l020Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = l020Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l020 l020Var = this.j;
        switch (b) {
            case 0:
                return new i020(l020Var, yjeVar, (byte) 0);
            default:
                return new i020(l020Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((i020) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        d020 d020Var;
        byte b = this.i;
        l020 l020Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean zA = l020Var.g.f15225a.a();
                p7m0 p7m0Var = l020Var.s;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, d020.a((d020) value, zA, 0, null, 6)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = l020Var.s;
                do {
                    value2 = p7m0Var2.getValue();
                    d020Var = (d020) value2;
                } while (!p7m0Var2.m(value2, d020.a(d020Var, false, l020Var.i.b(d020Var.b), null, 5)));
                break;
        }
        return Unit.f46060a;
    }
}
