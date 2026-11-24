package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sw30 extends zje {
    public n3w i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xw30 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw30(xw30 xw30Var, zje zjeVar) {
        super(zjeVar);
        this.l = xw30Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(this);
    }
}
