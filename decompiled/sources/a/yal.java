package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yal extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ebl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yal(ebl eblVar, zje zjeVar) {
        super(zjeVar);
        this.j = eblVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
