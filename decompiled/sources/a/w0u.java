package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w0u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ x0u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0u(x0u x0uVar, zje zjeVar) {
        super(zjeVar);
        this.j = x0uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
