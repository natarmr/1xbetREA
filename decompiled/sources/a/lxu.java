package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lxu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dgu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxu(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.j = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(0.0d, 0.0d, 0, 0, 0L, this, null);
    }
}
