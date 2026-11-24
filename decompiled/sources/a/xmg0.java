package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xmg0 extends zje {
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pzu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmg0(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.l = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.n0(null, null, null, null, null, 0, null, null, false, null, null, this);
    }
}
