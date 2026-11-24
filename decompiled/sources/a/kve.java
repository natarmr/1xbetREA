package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kve extends zje {
    public m9s i;
    public ms2 j;
    public ctc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ove m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kve(ove oveVar, zje zjeVar) {
        super(zjeVar);
        this.m = oveVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.n(null, null, null, null, this);
    }
}
