package a;

/* JADX INFO: loaded from: classes.dex */
public final class yjq extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zz2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjq(zz2 zz2Var, zje zjeVar) {
        super(zjeVar);
        this.k = zz2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(this);
    }
}
