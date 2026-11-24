package a;

/* JADX INFO: loaded from: classes6.dex */
public final class seu extends zje {
    public xqj0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f7u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seu(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.k = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, this);
    }
}
