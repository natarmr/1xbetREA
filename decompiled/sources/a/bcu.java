package a;

/* JADX INFO: loaded from: classes7.dex */
public final class bcu extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jtj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcu(jtj jtjVar, zje zjeVar) {
        super(zjeVar);
        this.k = jtjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(this, null, false, false);
    }
}
