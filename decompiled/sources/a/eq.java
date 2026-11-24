package a;

/* JADX INFO: loaded from: classes3.dex */
public final class eq extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fq j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(fq fqVar, zje zjeVar) {
        super(zjeVar);
        this.j = fqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(this);
    }
}
