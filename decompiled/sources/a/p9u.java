package a;

/* JADX INFO: loaded from: classes5.dex */
public final class p9u extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ o4m k;
    public kmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9u(o4m o4mVar, yje yjeVar) {
        super(yjeVar);
        this.k = o4mVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
