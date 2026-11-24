package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jgo0 extends zje {
    public fho0 i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fho0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgo0(fho0 fho0Var, zje zjeVar) {
        super(zjeVar);
        this.l = fho0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(this);
    }
}
