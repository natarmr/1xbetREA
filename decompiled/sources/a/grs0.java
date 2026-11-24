package a;

/* JADX INFO: loaded from: classes.dex */
public final class grs0 extends zje {
    public cu i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jrs0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grs0(jrs0 jrs0Var, zje zjeVar) {
        super(zjeVar);
        this.k = jrs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(this);
    }
}
