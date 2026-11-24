package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zgu extends zje {
    public bm5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ahu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgu(ahu ahuVar, zje zjeVar) {
        super(zjeVar);
        this.k = ahuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
