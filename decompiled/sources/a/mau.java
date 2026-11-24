package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mau extends zje {
    public int i;
    public int j;
    public int k;
    public int l;
    public sff0 m;
    public v8d n;
    public long o;
    public boolean p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ nau s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mau(nau nauVar, zje zjeVar) {
        super(zjeVar);
        this.s = nauVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(0, this);
    }
}
