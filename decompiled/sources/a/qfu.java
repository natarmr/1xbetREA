package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qfu extends zje {
    public sys0 i;
    public s77 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nc0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfu(nc0 nc0Var, zje zjeVar) {
        super(zjeVar);
        this.l = nc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(null, null, this);
    }
}
