package a;

import org.xplatform.widget.impl.workers.BestGamesRequestWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class tb6 extends zje {
    public String i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ BestGamesRequestWorker l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb6(BestGamesRequestWorker bestGamesRequestWorker, zje zjeVar) {
        super(zjeVar);
        this.l = bestGamesRequestWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
