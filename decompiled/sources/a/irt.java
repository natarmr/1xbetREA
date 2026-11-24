package a;

import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class irt extends zje {
    public long i;
    public HistoryTypeModel j;
    public ql5 k;
    public bsu l;
    public bm5 m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ jrt p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irt(jrt jrtVar, yje yjeVar) {
        super(yjeVar);
        this.p = jrtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(0L, null, this);
    }
}
