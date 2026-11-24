package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class p0v extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ tzi j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0v(tzi tziVar, int i, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.j = tziVar;
        this.k = i;
        this.l = z;
        this.m = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new p0v(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0v) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        tzi tziVar = this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = ((x4v) tziVar.b).a();
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Object krt0Var = new krt0(0L, false, false, 0.0d);
            if (g0g0Var instanceof g0g0) {
                g0g0Var = krt0Var;
            }
            krt0 krt0Var2 = (krt0) g0g0Var;
            zri zriVar = (zri) tziVar.f;
            boolean z2 = this.l;
            boolean z3 = z2 ? krt0Var2.c : krt0Var2.b;
            long j = krt0Var2.f18785a;
            boolean z4 = ((yiu) tziVar.g).a() || ((sff0) ((n0o0) tziVar.k).getValue()).O1;
            this.i = true;
            obj = ((uii) zriVar.b).l(this.k, z3, j, z2, ((j1q0) zriVar.c).f15748a.j(), this.m, z4, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return CollectionsKt.D0((Iterable) obj, 50);
    }
}
