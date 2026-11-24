package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tqg extends zje {
    public dqg i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vqg k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqg(vqg vqgVar, zje zjeVar) {
        super(zjeVar);
        this.k = vqgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.A(this);
    }
}
