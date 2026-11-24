package a;

/* JADX INFO: loaded from: classes3.dex */
public final class auo0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ buo0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auo0(buo0 buo0Var, zje zjeVar) {
        super(zjeVar);
        this.j = buo0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
