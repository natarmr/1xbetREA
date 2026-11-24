package a;

/* JADX INFO: loaded from: classes6.dex */
public final class teu extends zje {
    public xqj0 i;
    public zvs j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ f7u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teu(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.m = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, this);
    }
}
