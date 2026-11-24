package a;

/* JADX INFO: loaded from: classes3.dex */
public final class agj extends zje {
    public long i;
    public bhj j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jc0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agj(jc0 jc0Var, zje zjeVar) {
        super(zjeVar);
        this.l = jc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(0L, this);
    }
}
