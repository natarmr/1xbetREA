package a;

/* JADX INFO: loaded from: classes.dex */
public final class elt0 extends zje {
    public kka i;
    public krt0 j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ fht0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elt0(fht0 fht0Var, zje zjeVar) {
        super(zjeVar);
        this.n = fht0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.m(null, false, false, this);
    }
}
