package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n4w0 extends zje {
    public String i;
    public Object j;
    public z8w0 k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ z8w0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4w0(z8w0 z8w0Var, zje zjeVar) {
        super(zjeVar);
        this.n = z8w0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(this, null, false);
    }
}
