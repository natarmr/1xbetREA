package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class zda extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ t33 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zda(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t33Var;
        this.l = t33Var2;
        this.m = t33Var3;
        this.n = t33Var4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                zda zdaVar = new zda(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
                zdaVar.j = obj;
                return zdaVar;
            case 1:
                zda zdaVar2 = new zda(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
                zdaVar2.j = obj;
                return zdaVar2;
            default:
                zda zdaVar3 = new zda(this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
                zdaVar3.j = obj;
                return zdaVar3;
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
        return ((zda) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        t33 t33Var = this.n;
        t33 t33Var2 = this.m;
        t33 t33Var3 = this.l;
        t33 t33Var4 = this.k;
        yje yjeVar = null;
        vne vneVar = (vne) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new my7(t33Var4, yjeVar, (byte) 7), 3);
                qjj.W(vneVar, null, null, new my7(t33Var3, yjeVar, (byte) 8), 3);
                qjj.W(vneVar, null, null, new my7(t33Var2, yjeVar, (byte) 9), 3);
                return qjj.W(vneVar, null, null, new my7(t33Var, yjeVar, (byte) 10), 3);
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new my7(t33Var4, yjeVar, (byte) 11), 3);
                qjj.W(vneVar, null, null, new my7(t33Var3, yjeVar, (byte) 12), 3);
                qjj.W(vneVar, null, null, new my7(t33Var2, yjeVar, (byte) 13), 3);
                return qjj.W(vneVar, null, null, new my7(t33Var, yjeVar, (byte) 14), 3);
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new my7(t33Var4, yjeVar, (byte) 26), 3);
                qjj.W(vneVar, null, null, new my7(t33Var3, yjeVar, (byte) 27), 3);
                qjj.W(vneVar, null, null, new my7(t33Var2, yjeVar, (byte) 28), 3);
                return qjj.W(vneVar, null, null, new my7(t33Var, yjeVar, (byte) 29), 3);
        }
    }
}
