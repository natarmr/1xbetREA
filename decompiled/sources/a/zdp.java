package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zdp extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bep k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdp(bep bepVar, zje zjeVar) {
        super(zjeVar);
        this.k = bepVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.O(false, this);
    }
}
