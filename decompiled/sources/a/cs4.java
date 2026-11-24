package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cs4 extends zje {
    public String i;
    public ts4 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ts4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs4(ts4 ts4Var, zje zjeVar) {
        super(zjeVar);
        this.l = ts4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, this);
    }
}
