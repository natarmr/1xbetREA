package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bgj extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ jc0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(jc0 jc0Var, zje zjeVar) {
        super(zjeVar);
        this.j = jc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(this);
    }
}
