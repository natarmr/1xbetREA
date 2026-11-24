package a;

/* JADX INFO: loaded from: classes3.dex */
public final class d4k extends zje {
    public ql5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yqc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4k(yqc yqcVar, zje zjeVar) {
        super(zjeVar);
        this.k = yqcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.t(null, this);
    }
}
