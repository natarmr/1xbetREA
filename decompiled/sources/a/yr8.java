package a;

/* JADX INFO: loaded from: classes6.dex */
public final class yr8 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zr8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr8(zr8 zr8Var, zje zjeVar) {
        super(zjeVar);
        this.k = zr8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(0.0f, false, false, false, false, this);
    }
}
