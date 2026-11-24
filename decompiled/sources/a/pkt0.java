package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pkt0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ n1u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkt0(n1u n1uVar, zje zjeVar) {
        super(zjeVar);
        this.j = n1uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
