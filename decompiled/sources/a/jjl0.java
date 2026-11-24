package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jjl0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ sjl0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjl0(sjl0 sjl0Var, zje zjeVar) {
        super(zjeVar);
        this.j = sjl0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
