package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rxg0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tzi j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxg0(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.j = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(0L, this, false);
    }
}
