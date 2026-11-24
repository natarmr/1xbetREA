package a;

/* JADX INFO: loaded from: classes.dex */
public final class c660 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d660 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c660(d660 d660Var, zje zjeVar) {
        super(zjeVar);
        this.j = d660Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
