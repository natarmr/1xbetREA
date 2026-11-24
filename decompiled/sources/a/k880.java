package a;

/* JADX INFO: loaded from: classes3.dex */
public final class k880 extends zje {
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n880 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k880(n880 n880Var, zje zjeVar) {
        super(zjeVar);
        this.l = n880Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.P(null, null, this);
    }
}
