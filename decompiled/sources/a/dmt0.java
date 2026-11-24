package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dmt0 extends zje {
    public Object i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ emt0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmt0(emt0 emt0Var, zje zjeVar) {
        super(zjeVar);
        this.l = emt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
