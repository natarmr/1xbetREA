package a;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class v0v extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ daf m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ List o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0v(yje yjeVar, long j, daf dafVar, boolean z, List list, boolean z2, long j2) {
        super(3, yjeVar);
        this.l = j;
        this.m = dafVar;
        this.n = z;
        this.o = list;
        this.p = z2;
        this.q = j2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        v0v v0vVar = new v0v((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q);
        v0vVar.j = (kmq) obj;
        v0vVar.k = obj2;
        return v0vVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            jvn jvnVar = (jvn) this.k;
            vsg0 vsg0VarH0 = bkb.h0(this.l, TimeUnit.SECONDS, new u0v(this.m, this.n, this.o, this.p, this.q, jvnVar, null));
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, vsg0VarH0, this) == wneVar) {
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
