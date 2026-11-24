package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jin extends zje {
    public kin i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kin k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jin(kin kinVar, zje zjeVar) {
        super(zjeVar);
        this.k = kinVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.C(this);
    }
}
