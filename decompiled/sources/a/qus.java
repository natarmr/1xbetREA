package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qus extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rus j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qus(rus rusVar, zje zjeVar) {
        super(zjeVar);
        this.j = rusVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.l(this);
    }
}
