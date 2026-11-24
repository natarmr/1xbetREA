package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fm8 extends zje {
    public je8 i;
    public boolean j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ jm8 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm8(jm8 jm8Var, zje zjeVar) {
        super(zjeVar);
        this.n = jm8Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.P(null, false, this);
    }
}
