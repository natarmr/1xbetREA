package a;

/* JADX INFO: loaded from: classes5.dex */
public final class m3z extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tzi j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3z(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.j = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
