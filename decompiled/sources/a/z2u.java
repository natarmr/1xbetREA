package a;

/* JADX INFO: loaded from: classes3.dex */
public final class z2u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ a3u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2u(a3u a3uVar, zje zjeVar) {
        super(zjeVar);
        this.j = a3uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, 0L, this);
    }
}
