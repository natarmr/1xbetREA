package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yyz extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bzz j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyz(bzz bzzVar, zje zjeVar) {
        super(zjeVar);
        this.j = bzzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
