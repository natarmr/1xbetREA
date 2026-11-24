package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tat extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pbt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tat(pbt pbtVar, zje zjeVar) {
        super(zjeVar);
        this.k = pbtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, false, this);
    }
}
