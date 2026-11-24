package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nve extends zje {
    public ive i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ove k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nve(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.k = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.q(null, this);
    }
}
