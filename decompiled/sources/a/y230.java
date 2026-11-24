package a;

/* JADX INFO: loaded from: classes.dex */
public final class y230 extends zje {
    public aw20 i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public htz n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pyu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y230(pyu pyuVar, zje zjeVar) {
        super(zjeVar);
        this.p = pyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(null, this);
    }
}
