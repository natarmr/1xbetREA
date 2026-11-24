package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mve extends zje {
    public m0k0 i;
    public m9s j;
    public ms2 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ove m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mve(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.m = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.p(null, null, null, null, this);
    }
}
