package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wmt extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tzi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmt(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.k = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(this);
    }
}
