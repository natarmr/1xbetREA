package a;

/* JADX INFO: loaded from: classes4.dex */
public final class agl extends zje {
    public vgl i;
    public p7m0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cgl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agl(cgl cglVar, zje zjeVar) {
        super(zjeVar);
        this.l = cglVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.D(this);
    }
}
