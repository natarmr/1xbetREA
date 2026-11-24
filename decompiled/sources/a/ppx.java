package a;

/* JADX INFO: loaded from: classes.dex */
public final class ppx extends zje {
    public ru6 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e8u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppx(e8u e8uVar, zje zjeVar) {
        super(zjeVar);
        this.k = e8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
