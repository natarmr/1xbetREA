package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jco0 extends zje {
    public sh60 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zco0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jco0(zco0 zco0Var, zje zjeVar) {
        super(zjeVar);
        this.k = zco0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.Q(null, this);
    }
}
