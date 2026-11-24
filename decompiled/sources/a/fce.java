package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fce extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ c5k j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fce(c5k c5kVar, zje zjeVar) {
        super(zjeVar);
        this.j = c5kVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(0, this, false);
    }
}
