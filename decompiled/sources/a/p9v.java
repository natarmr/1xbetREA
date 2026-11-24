package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p9v extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ a4x n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ pz40 p;
    public final /* synthetic */ pz40 q;
    public final /* synthetic */ List r;
    public final /* synthetic */ a4x s;
    public final /* synthetic */ eav t;
    public final /* synthetic */ enm u;
    public final /* synthetic */ vne v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9v(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, a4x a4xVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, List list, a4x a4xVar2, eav eavVar, enm enmVar, vne vneVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = t33Var2;
        this.l = t33Var3;
        this.m = t33Var4;
        this.n = a4xVar;
        this.o = pz40Var;
        this.p = pz40Var2;
        this.q = pz40Var3;
        this.r = list;
        this.s = a4xVar2;
        this.t = eavVar;
        this.u = enmVar;
        this.v = vneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new p9v(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p9v) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        p9v p9vVar;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        enm enmVar = this.u;
        if (!z) {
            z1x.P(obj);
            t3t t3tVar = new t3t(enmVar, (byte) 13);
            this.i = true;
            p9vVar = this;
            if (aac.J(this.j, this.k, this.l, this.m, this.n, this.o, this.p, t3tVar, p9vVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            p9vVar = this;
        }
        p9vVar.q.setValue(Boolean.FALSE);
        p9v p9vVar2 = p9vVar;
        aac.a0(p9vVar.r, p9vVar.q, p9vVar.o, p9vVar.p, p9vVar.s, p9vVar.j, p9vVar.k, p9vVar2.l, p9vVar2.m, p9vVar.t, enmVar, p9vVar.v);
        return Unit.f46060a;
    }
}
