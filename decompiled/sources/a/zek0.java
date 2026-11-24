package a;

/* JADX INFO: loaded from: classes.dex */
public final class zek0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ afk0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zek0(afk0 afk0Var, zje zjeVar) {
        super(zjeVar);
        this.j = afk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, 0.0f, 0.0f, null, this);
    }
}
