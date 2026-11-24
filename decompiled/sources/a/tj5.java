package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tj5 extends zje {
    public m2c0 i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dk5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj5(dk5 dk5Var, zje zjeVar) {
        super(zjeVar);
        this.l = dk5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.y(null, null, this);
    }
}
