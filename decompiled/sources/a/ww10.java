package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ww10 extends zje {
    public cx10 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cx10 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww10(cx10 cx10Var, zje zjeVar) {
        super(zjeVar);
        this.l = cx10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
