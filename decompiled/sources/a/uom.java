package a;

/* JADX INFO: loaded from: classes6.dex */
public final class uom extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wom k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uom(wom womVar, zje zjeVar) {
        super(zjeVar);
        this.k = womVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
