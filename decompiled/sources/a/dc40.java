package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dc40 extends zje {
    public byte i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long n;
    public Throwable o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z220 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc40(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.q = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.E(0, this);
    }
}
