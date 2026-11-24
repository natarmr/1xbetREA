package a;

/* JADX INFO: loaded from: classes4.dex */
public final class cmd0 extends zje {
    public double i;
    public double j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gmd0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmd0(gmd0 gmd0Var, zje zjeVar) {
        super(zjeVar);
        this.l = gmd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(0.0d, 0.0d, null, this);
    }
}
