package a;

/* JADX INFO: loaded from: classes6.dex */
public final class mbx extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f7u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbx(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.j = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.B(this);
    }
}
