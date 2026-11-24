package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class rs90 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ xcz j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;
    public final /* synthetic */ pz40 n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ pz40 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ j73 r;
    public final /* synthetic */ pz40 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ vne u;
    public final /* synthetic */ a8x v;
    public final /* synthetic */ l7m0 w;
    public final /* synthetic */ pz40 x;
    public final /* synthetic */ cgk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs90(xcz xczVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, boolean z, j73 j73Var, pz40 pz40Var7, float f, vne vneVar, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var8, cgk0 cgk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = xczVar;
        this.k = pz40Var;
        this.l = pz40Var2;
        this.m = pz40Var3;
        this.n = pz40Var4;
        this.o = pz40Var5;
        this.p = pz40Var6;
        this.q = z;
        this.r = j73Var;
        this.s = pz40Var7;
        this.t = f;
        this.u = vneVar;
        this.v = a8xVar;
        this.w = l7m0Var;
        this.x = pz40Var8;
        this.y = cgk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new rs90(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rs90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            gmq gmqVarW = i120.W(ydx.V(null, new gg90(this.j, (byte) 8)));
            qs90 qs90Var = new qs90(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.j, this.t, this.u, this.v, this.w, this.x, this.y);
            this.i = true;
            if (gmqVarW.c(qs90Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
