package a;

/* JADX INFO: loaded from: classes4.dex */
public final class knq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ a1g k;
    public kmq l;
    public Throwable m;
    public int n;
    public int o;
    public long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knq(a1g a1gVar, yje yjeVar) {
        super(yjeVar);
        this.k = a1gVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
