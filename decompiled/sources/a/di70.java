package a;

/* JADX INFO: loaded from: classes3.dex */
public final class di70 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ji70 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di70(ji70 ji70Var, zje zjeVar) {
        super(zjeVar);
        this.k = ji70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(null, this);
    }
}
