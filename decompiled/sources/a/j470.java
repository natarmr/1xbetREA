package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j470 extends zje {
    public z470 i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ l470 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j470(l470 l470Var, zje zjeVar) {
        super(zjeVar);
        this.p = l470Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.m(null, null, this);
    }
}
