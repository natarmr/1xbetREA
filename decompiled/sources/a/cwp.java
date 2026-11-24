package a;

/* JADX INFO: loaded from: classes.dex */
public final class cwp extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fhj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwp(fhj fhjVar, zje zjeVar) {
        super(zjeVar);
        this.j = fhjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.q(null, this);
    }
}
