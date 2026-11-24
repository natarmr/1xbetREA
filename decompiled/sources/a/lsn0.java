package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lsn0 extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fuj0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsn0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.k = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(this);
    }
}
