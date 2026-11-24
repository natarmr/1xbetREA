package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w100 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ c200 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w100(c200 c200Var, zje zjeVar) {
        super(zjeVar);
        this.j = c200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, null, this);
    }
}
