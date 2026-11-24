package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vyb0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ sd60 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyb0(sd60 sd60Var, yje yjeVar) {
        super(yjeVar);
        this.j = sd60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, this);
    }
}
