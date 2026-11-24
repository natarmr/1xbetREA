package a;

/* JADX INFO: loaded from: classes.dex */
public final class skn0 extends zje {
    public tkn0 i;
    public w7r j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tkn0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skn0(tkn0 tkn0Var, zje zjeVar) {
        super(zjeVar);
        this.l = tkn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, this);
    }
}
