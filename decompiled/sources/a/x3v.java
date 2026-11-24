package a;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class x3v extends zje {
    public long i;
    public Date j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y3v m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3v(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.m = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(0L, null, 0, this);
    }
}
