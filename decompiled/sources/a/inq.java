package a;

/* JADX INFO: loaded from: classes5.dex */
public final class inq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ o4m j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inq(o4m o4mVar, yje yjeVar) {
        super(yjeVar);
        this.j = o4mVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
