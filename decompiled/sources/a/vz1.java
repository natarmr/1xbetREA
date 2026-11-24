package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vz1 extends zje {
    public myr0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wz1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz1(wz1 wz1Var, zje zjeVar) {
        super(zjeVar);
        this.k = wz1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.S(null, this);
    }
}
