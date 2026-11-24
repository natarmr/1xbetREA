package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class n9v extends bnn0 implements Function2 {
    public final /* synthetic */ t33 i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ pz40 m;
    public final /* synthetic */ pz40 n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ eav p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9v(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, eav eavVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = t33Var;
        this.j = t33Var2;
        this.k = t33Var3;
        this.l = t33Var4;
        this.m = pz40Var;
        this.n = pz40Var2;
        this.o = pz40Var3;
        this.p = eavVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new n9v(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n9v) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (!this.i.e() && !this.j.e() && !this.k.e() && !this.l.e()) {
            ((Function1) this.m.getValue()).invoke(this.n.getValue());
            this.o.setValue(this.p.f7488a);
        }
        return Unit.f46060a;
    }
}
