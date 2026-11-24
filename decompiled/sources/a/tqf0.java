package a;

/* JADX INFO: loaded from: classes5.dex */
public final class tqf0 extends zje {
    public int i;
    public Integer j;
    public String k;
    public drf0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uqf0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqf0(uqf0 uqf0Var, zje zjeVar) {
        super(zjeVar);
        this.n = uqf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(0, null, null, this);
    }
}
