package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q3u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3u(d4u d4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = d4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, null, 0, this);
    }
}
