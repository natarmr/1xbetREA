package a;

/* JADX INFO: loaded from: classes3.dex */
public final class arj extends zje {
    public hpj i;
    public /* synthetic */ Object j;
    public final /* synthetic */ erj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.k = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.D0(null, this);
    }
}
