package a;

/* JADX INFO: loaded from: classes4.dex */
public final class av00 extends zje {
    public long i;
    public String j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yuu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av00(yuu yuuVar, zje zjeVar) {
        super(zjeVar);
        this.m = yuuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.q(0L, this, null, false);
    }
}
