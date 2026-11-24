package a;

/* JADX INFO: loaded from: classes5.dex */
public final class w38 extends zje {
    public String i;
    public String j;
    public String k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d48 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w38(d48 d48Var, zje zjeVar) {
        super(zjeVar);
        this.n = d48Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(null, null, null, this);
    }
}
