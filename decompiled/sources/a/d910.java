package a;

/* JADX INFO: loaded from: classes3.dex */
public final class d910 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ e910 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d910(e910 e910Var, yje yjeVar) {
        super(yjeVar);
        this.j = e910Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.x(this);
    }
}
