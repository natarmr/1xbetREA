package a;

/* JADX INFO: loaded from: classes.dex */
public final class rfi0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ufi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfi0(ufi0 ufi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ufi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
