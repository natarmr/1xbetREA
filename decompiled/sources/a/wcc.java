package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wcc extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xcc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcc(xcc xccVar, yje yjeVar) {
        super(yjeVar);
        this.j = xccVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
