package a;

/* JADX INFO: loaded from: classes4.dex */
public final class scf extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xcf j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scf(xcf xcfVar, zje zjeVar) {
        super(zjeVar);
        this.j = xcfVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, 0.0f, this);
    }
}
