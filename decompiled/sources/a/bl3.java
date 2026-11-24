package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bl3 extends zje {
    public String i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cl3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl3(cl3 cl3Var, zje zjeVar) {
        super(zjeVar);
        this.l = cl3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, 0L, this);
    }
}
