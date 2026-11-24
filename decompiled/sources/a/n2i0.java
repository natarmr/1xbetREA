package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n2i0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ o2i0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2i0(o2i0 o2i0Var, zje zjeVar) {
        super(zjeVar);
        this.j = o2i0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
