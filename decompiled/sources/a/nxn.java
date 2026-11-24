package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class nxn extends bnn0 implements Function2 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ vne j;
    public final /* synthetic */ c0d k;
    public final /* synthetic */ k43 l;
    public final /* synthetic */ wz40 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ wz40 p;
    public final /* synthetic */ pz40 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxn(boolean z, vne vneVar, c0d c0dVar, k43 k43Var, wz40 wz40Var, boolean z2, boolean z3, wz40 wz40Var2, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = z;
        this.j = vneVar;
        this.k = c0dVar;
        this.l = k43Var;
        this.m = wz40Var;
        this.n = z2;
        this.o = z3;
        this.p = wz40Var2;
        this.q = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new nxn(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nxn) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean z = this.i;
        c0d c0dVar = this.k;
        if (!z) {
            pz40 pz40Var = this.q;
            bby bbyVar = (bby) pz40Var.getValue();
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            o43 o43Var = (o43) this.m.f40005a;
            vne vneVar = this.j;
            vneVar.getClass();
            o43Var.getClass();
            pz40Var.setValue(qjj.W(vneVar, null, null, new rxn(o43Var, this.n, this.l, this.o, c0dVar, null), 3));
        }
        this.p.f40005a = c0dVar;
        return Unit.f46060a;
    }
}
