package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class tze extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ String j;
    public /* synthetic */ d680 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tze(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i = 3;
        String str = (String) obj;
        d680 d680Var = (d680) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                tze tzeVar = new tze(i, yjeVar, (byte) 0);
                tzeVar.j = str;
                tzeVar.k = d680Var;
                return tzeVar.invokeSuspend(Unit.f46060a);
            default:
                tze tzeVar2 = new tze(i, yjeVar, (byte) 1);
                tzeVar2.j = str;
                tzeVar2.k = d680Var;
                return tzeVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                String str = this.j;
                d680 d680Var = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new Pair(str, d680Var);
            default:
                String str2 = this.j;
                d680 d680Var2 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new Pair(str2, d680Var2);
        }
    }
}
