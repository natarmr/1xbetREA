package a;

import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class go00 extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j700 l;
    public final /* synthetic */ pzu m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Set o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;
    public final /* synthetic */ Set r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go00(yje yjeVar, j700 j700Var, pzu pzuVar, int i, Set set, boolean z, long j, Set set2, boolean z2, long j2) {
        super(3, yjeVar);
        this.l = j700Var;
        this.m = pzuVar;
        this.n = i;
        this.o = set;
        this.p = z;
        this.q = j;
        this.r = set2;
        this.s = z2;
        this.t = j2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        go00 go00Var = new go00((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
        go00Var.j = (kmq) obj;
        go00Var.k = obj2;
        return go00Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            jvn jvnVar = (jvn) this.k;
            j700 j700Var = this.l;
            boolean zJ = t9x.J(j700Var);
            pzu pzuVar = this.m;
            lef0 lef0Var = (lef0) pzuVar.b;
            utb utbVarC = zJ ? aoq.c(((m8l0) lef0Var.f19899a).f21376a, new jo00(null, j700Var, pzuVar, this.n, this.o, jvnVar, this.p, this.q, this.r)) : aoq.c(new p6d(lef0Var.f(this.s), lef0Var.g(), io00.h, (byte) 1), new ho00(null, pzuVar, this.n, this.o, jvnVar, this.p, this.q, this.r, this.t));
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, utbVarC, this) == wneVar) {
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
