package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class py7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py7(t33 t33Var, t33 t33Var2, t33 t33Var3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = t33Var2;
        this.m = t33Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                py7 py7Var = new py7(this.k, this.l, this.m, yjeVar, (byte) 0);
                py7Var.j = obj;
                return py7Var;
            case 1:
                py7 py7Var2 = new py7(this.k, this.l, this.m, yjeVar, (byte) 1);
                py7Var2.j = obj;
                return py7Var2;
            default:
                py7 py7Var3 = new py7(this.k, this.l, this.m, yjeVar, (byte) 2);
                py7Var3.j = obj;
                return py7Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((py7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        t33 t33Var = this.m;
        t33 t33Var2 = this.l;
        t33 t33Var3 = this.k;
        yje yjeVar = null;
        byte b2 = 3;
        vne vneVar = (vne) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new my7(t33Var3, yjeVar, b2), 3);
                qjj.W(vneVar, null, null, new my7(t33Var2, yjeVar, (byte) 4), 3);
                return qjj.W(vneVar, null, null, new my7(t33Var, yjeVar, (byte) 5), 3);
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new my7(t33Var3, yjeVar, (byte) 23), 3);
                qjj.W(vneVar, null, null, new my7(t33Var2, yjeVar, (byte) 24), 3);
                return qjj.W(vneVar, null, null, new my7(t33Var, yjeVar, (byte) 25), 3);
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new pna0(t33Var3, yjeVar, (byte) 0), 3);
                qjj.W(vneVar, null, null, new pna0(t33Var2, yjeVar, (byte) 1), 3);
                return qjj.W(vneVar, null, null, new pna0(t33Var, yjeVar, (byte) 2), 3);
        }
    }
}
