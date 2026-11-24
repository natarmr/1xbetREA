package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dlv extends zje {
    public l9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pwi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlv(pwi pwiVar, zje zjeVar) {
        super(zjeVar);
        this.k = pwiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(null, null, this);
    }
}
