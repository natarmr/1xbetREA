package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ssu extends zje {
    public boolean i;
    public m2c0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ phf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssu(phf0 phf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = phf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.v(false, this);
    }
}
