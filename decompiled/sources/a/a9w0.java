package a;

/* JADX INFO: loaded from: classes5.dex */
public final class a9w0 extends zje {
    public u8w0 i;
    public u8w0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rkt0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9w0(rkt0 rkt0Var, zje zjeVar) {
        super(zjeVar);
        this.l = rkt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(this);
    }
}
