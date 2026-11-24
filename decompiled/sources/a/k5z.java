package a;

/* JADX INFO: loaded from: classes5.dex */
public final class k5z extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ j5z k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5z(j5z j5zVar, yje yjeVar) {
        super(yjeVar);
        this.k = j5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
