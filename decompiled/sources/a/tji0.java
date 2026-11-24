package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tji0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ uji0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tji0(uji0 uji0Var, zje zjeVar) {
        super(zjeVar);
        this.j = uji0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
