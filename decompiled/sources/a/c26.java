package a;

/* JADX INFO: loaded from: classes.dex */
public final class c26 extends zje {
    public tdg0 i;
    public qpg0 j;
    public Object k;
    public int l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tdg0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c26(tdg0 tdg0Var, zje zjeVar) {
        super(zjeVar);
        this.o = tdg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return tdg0.k(this.o, null, 0, 0, this);
    }
}
