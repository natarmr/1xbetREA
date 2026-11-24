package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ek2 extends zje {
    public tj2 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fk2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek2(fk2 fk2Var, zje zjeVar) {
        super(zjeVar);
        this.k = fk2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.P(null, this);
    }
}
