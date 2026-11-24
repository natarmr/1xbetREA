package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uru extends zje {
    public boolean i;
    public ql5 j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tzi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uru(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.m = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(false, null, this);
    }
}
