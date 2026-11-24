package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q910 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ u910 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ float n;
    public final /* synthetic */ fa10 o;
    public final /* synthetic */ float p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ ea10 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q910(u910 u910Var, int i, int i2, boolean z, float f, fa10 fa10Var, float f2, boolean z2, ea10 ea10Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = u910Var;
        this.k = i;
        this.l = i2;
        this.m = z;
        this.n = f;
        this.o = fa10Var;
        this.p = f2;
        this.q = z2;
        this.r = ea10Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new q910(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q910) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        u910 u910Var = this.j;
        try {
            if (!z) {
                z1x.P(obj);
                u910Var.i(this.k);
                pz40 pz40Var = u910Var.c;
                int i = this.l;
                ((hgk0) pz40Var).setValue(Integer.valueOf(i));
                ((hgk0) u910Var.d).setValue(Boolean.valueOf(this.m));
                pz40 pz40Var2 = u910Var.f;
                float f = this.n;
                ((hgk0) pz40Var2).setValue(Float.valueOf(f));
                ((hgk0) u910Var.e).setValue(null);
                hgk0 hgk0Var = (hgk0) u910Var.i;
                fa10 fa10Var = this.o;
                hgk0Var.setValue(fa10Var);
                u910Var.k(this.p);
                ((hgk0) u910Var.g).setValue(Boolean.valueOf(this.q));
                ((hgk0) u910Var.l).setValue(Long.MIN_VALUE);
                if (fa10Var == null) {
                    u910Var.j(false);
                    return Unit.f46060a;
                }
                if (Float.isInfinite(f)) {
                    u910Var.k(((Number) u910Var.m.getValue()).floatValue());
                    u910Var.j(false);
                    u910Var.i(i);
                    return Unit.f46060a;
                }
                u910Var.j(true);
                int iOrdinal = this.r.ordinal();
                if (iOrdinal == 0) {
                    coroutineContext = kotlin.coroutines.g.f46065a;
                } else {
                    if (iOrdinal != 1) {
                        throw new m460();
                    }
                    coroutineContext = z560.b;
                }
                p910 p910Var = new p910(this.r, zvw.R(getContext()), this.l, this.k, u910Var, null);
                this.i = true;
                if (qjj.d0(coroutineContext, p910Var, this) == wneVar) {
                    return wneVar;
                }
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            zvw.O(getContext());
            u910Var.j(false);
            return Unit.f46060a;
        } catch (Throwable th) {
            u910Var.j(false);
            throw th;
        }
    }
}
