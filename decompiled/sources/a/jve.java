package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jve extends zje {
    public m9s i;
    public ms2 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ove l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jve(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.l = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(null, null, null, null, this);
    }
}
