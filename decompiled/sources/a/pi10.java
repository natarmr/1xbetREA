package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pi10 extends zje {
    public String i;
    public qi10 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ qi10 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi10(qi10 qi10Var, zje zjeVar) {
        super(zjeVar);
        this.n = qi10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
