package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c3g extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ f3g j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ x3m o;
    public final /* synthetic */ pz40 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ pz40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3g(f3g f3gVar, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, boolean z, x3m x3mVar, pz40 pz40Var4, boolean z2, pz40 pz40Var5, yje yjeVar) {
        super(2, yjeVar);
        this.j = f3gVar;
        this.k = pz40Var;
        this.l = pz40Var2;
        this.m = pz40Var3;
        this.n = z;
        this.o = x3mVar;
        this.p = pz40Var4;
        this.q = z2;
        this.r = pz40Var5;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c3g(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c3g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            hie0 hie0Var = new hie0();
            f3g f3gVar = this.j;
            hie0Var.f13108a = (f3gVar != null ? f3gVar.f8861a : null) != null;
            vsg0 vsg0VarV = ydx.V(null, new kk0(this.k, this.l, this.m, (byte) 23));
            b3g b3gVar = new b3g(hie0Var, this.n, this.o, this.p, this.q, this.r);
            this.i = true;
            if (vsg0VarV.c(b3gVar, this) == wneVar) {
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
