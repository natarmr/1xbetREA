package a;

/* JADX INFO: loaded from: classes2.dex */
public final class amt0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cmt0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amt0(cmt0 cmt0Var, zje zjeVar) {
        super(zjeVar);
        this.j = cmt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
