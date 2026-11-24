package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ps90 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ xcz j;
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
    public final /* synthetic */ pz40 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps90(float f, j73 j73Var, yje yjeVar, vne vneVar, a8x a8xVar, xcz xczVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, pz40 pz40Var7, cgk0 cgk0Var, l7m0 l7m0Var, boolean z) {
        super(2, yjeVar);
        this.j = xczVar;
        this.k = pz40Var;
        this.l = pz40Var2;
        this.m = pz40Var3;
        this.n = pz40Var4;
        this.o = z;
        this.p = j73Var;
        this.q = pz40Var5;
        this.r = f;
        this.s = vneVar;
        this.t = a8xVar;
        this.u = l7m0Var;
        this.v = pz40Var6;
        this.w = cgk0Var;
        this.x = pz40Var7;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        cgk0 cgk0Var = this.w;
        return new ps90(this.r, this.p, yjeVar, this.s, this.t, this.j, this.k, this.l, this.m, this.n, this.q, this.v, this.x, cgk0Var, this.u, this.o);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ps90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        xcz xczVar = this.j;
        if (!z) {
            z1x.P(obj);
            wk30 wk30Var = new wk30(i120.W(ydx.V(null, new gg90(xczVar, (byte) 7))), (byte) 15);
            this.i = true;
            if (ntb.K(wk30Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        float f = ys90.f43156a;
        pz40 pz40Var = this.k;
        if (((Boolean) pz40Var.getValue()).booleanValue()) {
            return Unit.f46060a;
        }
        Boolean bool = Boolean.TRUE;
        pz40Var.setValue(bool);
        if (xczVar.j.a() || ys90.c(this.l)) {
            this.x.setValue(bool);
        } else {
            ys90.b(this.m, this.n, this.o, this.p, this.q, this.j, this.r, this.s, this.l, this.t, this.u, this.v, this.w);
        }
        return Unit.f46060a;
    }
}
