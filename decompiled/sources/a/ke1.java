package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ke1 extends zje {
    public km80 i;
    public Boolean j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ le1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke1(le1 le1Var, zje zjeVar) {
        super(zjeVar);
        this.n = le1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.f(null, this);
    }
}
