package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bpx extends zje {
    public Object i;
    public bm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ abu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpx(abu abuVar, zje zjeVar) {
        super(zjeVar);
        this.l = abuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.y(this);
    }
}
