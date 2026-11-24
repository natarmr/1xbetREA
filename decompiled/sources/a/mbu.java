package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mbu extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nbu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbu(nbu nbuVar, zje zjeVar) {
        super(zjeVar);
        this.k = nbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, false, this);
    }
}
