package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class tkf0 extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ or30 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkf0(Function1 function1, or30 or30Var, long j, long j2, long j3, long j4, boolean z, boolean z2, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.k = function1;
        this.l = or30Var;
        this.m = j;
        this.n = j2;
        this.o = j3;
        this.p = j4;
        this.q = z;
        this.r = z2;
        this.s = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        tkf0 tkf0Var = new tkf0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
        tkf0Var.j = obj;
        return tkf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tkf0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = (kmq) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            skf0 skf0Var = new skf0(kmqVar, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, null);
            this.j = null;
            this.i = true;
            if (d5c.J(this, skf0Var) == wneVar) {
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
