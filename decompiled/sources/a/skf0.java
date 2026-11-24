package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class skf0 extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kmq k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ or30 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skf0(kmq kmqVar, Function1 function1, or30 or30Var, long j, long j2, long j3, long j4, boolean z, boolean z2, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.k = kmqVar;
        this.l = function1;
        this.m = or30Var;
        this.n = j;
        this.o = j2;
        this.p = j3;
        this.q = j4;
        this.r = z;
        this.s = z2;
        this.t = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        skf0 skf0Var = new skf0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
        skf0Var.j = obj;
        return skf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((skf0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            rkf0 rkf0Var = new rkf0(vneVar, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
            this.j = null;
            this.i = true;
            if (rkf0Var.e(this) == wneVar) {
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
