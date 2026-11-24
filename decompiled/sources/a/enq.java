package a;

/* JADX INFO: loaded from: classes2.dex */
public final class enq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ fnq k;
    public kmq l;
    public qsg0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enq(fnq fnqVar, yje yjeVar) {
        super(yjeVar);
        this.k = fnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
