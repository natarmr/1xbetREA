package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ccu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dcu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccu(dcu dcuVar, zje zjeVar) {
        super(zjeVar);
        this.j = dcuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}
