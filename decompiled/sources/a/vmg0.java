package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vmg0 extends zje {
    public String i;
    public String j;
    public pzu k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pzu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmg0(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.n = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.L(this, null, null, false);
    }
}
