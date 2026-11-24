package a;

/* JADX INFO: loaded from: classes4.dex */
public final class d5v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ nnt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5v(nnt nntVar, yje yjeVar) {
        super(yjeVar);
        this.k = nntVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
