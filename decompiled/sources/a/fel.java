package a;

/* JADX INFO: loaded from: classes.dex */
public final class fel extends zje {
    public pdl i;
    public nel j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hel l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fel(hel helVar, zje zjeVar) {
        super(zjeVar);
        this.l = helVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l1(null, this);
    }
}
