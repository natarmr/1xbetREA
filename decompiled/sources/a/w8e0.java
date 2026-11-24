package a;

/* JADX INFO: loaded from: classes6.dex */
public final class w8e0 extends zje {
    public y4e0 i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x8e0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8e0(x8e0 x8e0Var, zje zjeVar) {
        super(zjeVar);
        this.l = x8e0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.N(null, this);
    }
}
