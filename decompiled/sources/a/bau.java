package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bau extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uii k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bau(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.k = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
