package a;

import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final class s7e0 extends zje {
    public RatingStatisticScreenParams i;
    public Throwable j;
    public long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z220 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7e0(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.q = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.o(null, this);
    }
}
