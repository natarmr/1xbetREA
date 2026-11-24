package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yxc0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ayc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxc0(ayc0 ayc0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ayc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O(this);
    }
}
