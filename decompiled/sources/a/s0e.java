package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s0e extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ g1e j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0e(g1e g1eVar, zje zjeVar) {
        super(zjeVar);
        this.j = g1eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(null, this);
    }
}
