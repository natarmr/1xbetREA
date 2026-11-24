package a;

/* JADX INFO: loaded from: classes.dex */
public final class x8w0 extends zje {
    public xcm0 i;
    public u4w0 j;
    public String k;
    public String l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ trm0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8w0(trm0 trm0Var, zje zjeVar) {
        super(zjeVar);
        this.o = trm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, this);
    }
}
