package a;

/* JADX INFO: loaded from: classes4.dex */
public final class x5u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ p4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5u(p4u p4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = p4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(0, this, null);
    }
}
