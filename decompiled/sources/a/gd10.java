package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gd10 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ hd10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd10(hd10 hd10Var, zje zjeVar) {
        super(zjeVar);
        this.j = hd10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, null, null, null, this);
    }
}
