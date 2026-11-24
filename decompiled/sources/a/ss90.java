package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ss90 extends bnn0 implements Function2 {
    public final /* synthetic */ xcz i;
    public final /* synthetic */ pz40 j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;
    public final /* synthetic */ pz40 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ j73 p;
    public final /* synthetic */ pz40 q;
    public final /* synthetic */ float r;
    public final /* synthetic */ vne s;
    public final /* synthetic */ a8x t;
    public final /* synthetic */ l7m0 u;
    public final /* synthetic */ pz40 v;
    public final /* synthetic */ cgk0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss90(float f, j73 j73Var, yje yjeVar, vne vneVar, a8x a8xVar, xcz xczVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, pz40 pz40Var7, cgk0 cgk0Var, l7m0 l7m0Var, boolean z) {
        super(2, yjeVar);
        this.i = xczVar;
        this.j = pz40Var;
        this.k = pz40Var2;
        this.l = pz40Var3;
        this.m = pz40Var4;
        this.n = pz40Var5;
        this.o = z;
        this.p = j73Var;
        this.q = pz40Var6;
        this.r = f;
        this.s = vneVar;
        this.t = a8xVar;
        this.u = l7m0Var;
        this.v = pz40Var7;
        this.w = cgk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ss90(this.r, this.p, yjeVar, this.s, this.t, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.v, this.w, this.u, this.o);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ss90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        float f = ys90.f43156a;
        pz40 pz40Var = this.j;
        if (!((Boolean) pz40Var.getValue()).booleanValue()) {
            pz40 pz40Var2 = this.k;
            if (((Boolean) pz40Var2.getValue()).booleanValue() && !this.i.j.a()) {
                Boolean bool = Boolean.FALSE;
                pz40Var2.setValue(bool);
                this.l.setValue(bool);
                ys90.b(this.m, this.n, this.o, this.p, this.q, this.i, this.r, this.s, pz40Var, this.t, this.u, this.v, this.w);
            }
        }
        return Unit.f46060a;
    }
}
