package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c9u extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ ali l;
    public final /* synthetic */ int m;
    public final /* synthetic */ List n;
    public final /* synthetic */ jvn o;
    public final /* synthetic */ long p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9u(boolean z, ali aliVar, int i, List list, jvn jvnVar, long j, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.l = aliVar;
        this.m = i;
        this.n = list;
        this.o = jvnVar;
        this.p = j;
        this.q = z2;
        this.r = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        c9u c9uVar = new c9u(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
        c9uVar.j = obj;
        return c9uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c9u) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = (kmq) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            boolean z2 = this.k;
            long j = z2 ? 8L : 30L;
            long j2 = this.p;
            ali aliVar = this.l;
            a1g a1gVarI0 = bkb.i0(aoq.c(bkb.h0(j, TimeUnit.SECONDS, new a9u(aliVar, z2, this.m, this.n, this.o, j2, null)), new b9u((byte) 0, null, aliVar, this.q, this.r)), kng0.l("load ", this.k ? "Live" : "Line", " GamesOfFavoritesChamps"), 3, 3L, q3d.j(SocketTimeoutException.class, UnknownHostException.class), q3d.j(new Integer(i2o.NotFound.getErrorCode()), new Integer(i2o.Forbidden.getErrorCode()), new Integer(i2o.BadRequest.getErrorCode()), new Integer(i2o.l1.getErrorCode())), null, 32);
            this.j = null;
            this.i = true;
            if (slb.Q(kmqVar, a1gVarI0, this) == wneVar) {
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
