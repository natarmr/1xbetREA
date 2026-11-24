package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ygu extends zje {
    public bm5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ahu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygu(ahu ahuVar, yje yjeVar) {
        super(yjeVar);
        this.k = ahuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
