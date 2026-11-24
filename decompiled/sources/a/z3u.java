package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z3u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d4u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3u(d4u d4uVar, zje zjeVar) {
        super(zjeVar);
        this.j = d4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(0, this, null);
    }
}
