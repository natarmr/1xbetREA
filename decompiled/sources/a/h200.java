package a;

/* JADX INFO: loaded from: classes2.dex */
public final class h200 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r200 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h200(r200 r200Var, zje zjeVar) {
        super(zjeVar);
        this.j = r200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(false, this);
    }
}
