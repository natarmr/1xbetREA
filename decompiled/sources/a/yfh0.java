package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yfh0 extends zje {
    public String i;
    public hl1 j;
    public ouu k;
    public byte l;
    public int m;
    public boolean n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ouu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfh0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.q = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.B(0, this, null, false);
    }
}
