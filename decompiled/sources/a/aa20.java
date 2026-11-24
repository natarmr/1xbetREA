package a;

/* JADX INFO: loaded from: classes6.dex */
public final class aa20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dgu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa20(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.j = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, 0L, 0L, 0L, 0.0d, null, 0, null, 0, this);
    }
}
