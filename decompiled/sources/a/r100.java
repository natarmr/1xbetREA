package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r100 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b200 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r100(b200 b200Var, zje zjeVar) {
        super(zjeVar);
        this.j = b200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
