package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hfu extends zje {
    public yeu i;
    public int j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ a6u o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfu(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.o = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.M(null, 0, 0, this);
    }
}
