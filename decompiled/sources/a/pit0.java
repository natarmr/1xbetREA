package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pit0 extends zje {
    public boolean i;
    public sff0 j;
    public lrc k;
    public fht0 l;
    public long m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ sd60 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pit0(sd60 sd60Var, zje zjeVar) {
        super(zjeVar);
        this.p = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.h(this);
    }
}
