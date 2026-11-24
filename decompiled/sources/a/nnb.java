package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nnb extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ mnb j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnb(mnb mnbVar, zje zjeVar) {
        super(zjeVar);
        this.j = mnbVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
