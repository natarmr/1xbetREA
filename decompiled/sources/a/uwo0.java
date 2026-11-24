package a;

import org.xplatform.betting.core.tax.TaxStatusWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class uwo0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ TaxStatusWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwo0(TaxStatusWorker taxStatusWorker, zje zjeVar) {
        super(zjeVar);
        this.j = taxStatusWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
