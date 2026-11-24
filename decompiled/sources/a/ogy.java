package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ogy extends zje {
    public i7a i;
    public rv00 j;
    public rv00 k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ izx n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogy(izx izxVar, zje zjeVar) {
        super(zjeVar);
        this.n = izxVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, this);
    }
}
