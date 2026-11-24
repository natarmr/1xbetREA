package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zg70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ eh70 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg70(eh70 eh70Var, zje zjeVar) {
        super(zjeVar);
        this.j = eh70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.A(this);
    }
}
