package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x8p extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kki k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8p(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.k = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, this);
    }
}
