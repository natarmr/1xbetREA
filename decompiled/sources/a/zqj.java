package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zqj extends zje {
    public hdd0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ erj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.k = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.E0(null, this);
    }
}
