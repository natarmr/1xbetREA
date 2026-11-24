package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o060 extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ ncz j;
    public /* synthetic */ ncz k;
    public final /* synthetic */ pz40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o060(pz40 pz40Var, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.l;
        switch (b) {
            case 0:
                ncz nczVar = this.j;
                ncz nczVar2 = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((Function1) pz40Var.getValue()).invoke(new a060(nczVar.f23317a, nczVar2.f23317a));
                break;
            default:
                ncz nczVar3 = this.j;
                ncz nczVar4 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((Function1) pz40Var.getValue()).invoke(new qrl0(nczVar3.f23317a, nczVar4.f23317a));
                break;
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        pz40 pz40Var = this.l;
        ncz nczVar = (ncz) obj2;
        ncz nczVar2 = (ncz) obj3;
        yje yjeVar = (yje) obj4;
        switch (b) {
            case 0:
                o060 o060Var = new o060(pz40Var, yjeVar, (byte) 0);
                o060Var.j = nczVar;
                o060Var.k = nczVar2;
                return o060Var.invokeSuspend(Unit.f46060a);
            default:
                o060 o060Var2 = new o060(pz40Var, yjeVar, (byte) 1);
                o060Var2.j = nczVar;
                o060Var2.k = nczVar2;
                return o060Var2.invokeSuspend(Unit.f46060a);
        }
    }
}
