package a;

/* JADX INFO: loaded from: classes4.dex */
public final class iys extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ lys k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iys(lys lysVar, yje yjeVar) {
        super(yjeVar);
        this.k = lysVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
