package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hoi0 extends zje {
    public List i;
    public gwe j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gbi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoi0(gbi gbiVar, zje zjeVar) {
        super(zjeVar);
        this.m = gbiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.B(null, null, 0L, this);
    }
}
