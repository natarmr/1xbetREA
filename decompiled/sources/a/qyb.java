package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qyb extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ryb j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyb(ryb rybVar, zje zjeVar) {
        super(zjeVar);
        this.j = rybVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, this, null);
    }
}
