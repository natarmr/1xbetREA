package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q230 extends zje {
    public i230 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ u230 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q230(u230 u230Var, zje zjeVar) {
        super(zjeVar);
        this.l = u230Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, this);
    }
}
