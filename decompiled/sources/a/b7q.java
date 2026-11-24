package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b7q extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ h7q j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7q(h7q h7qVar, zje zjeVar) {
        super(zjeVar);
        this.j = h7qVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0, 0, null, 0, this);
    }
}
