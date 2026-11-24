package a;

import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes5.dex */
public final class b1m0 extends zje {
    public TypeStageId i;
    public Throwable j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nvu r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1m0(nvu nvuVar, zje zjeVar) {
        super(zjeVar);
        this.r = nvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.C(null, false, this);
    }
}
