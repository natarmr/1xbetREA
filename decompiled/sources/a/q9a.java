package a;

/* JADX INFO: loaded from: classes.dex */
public final class q9a extends zje {
    public mie0 i;
    public mie0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r9a l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9a(r9a r9aVar, zje zjeVar) {
        super(zjeVar);
        this.l = r9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(this);
    }
}
