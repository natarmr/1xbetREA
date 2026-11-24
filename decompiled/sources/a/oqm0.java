package a;

/* JADX INFO: loaded from: classes3.dex */
public final class oqm0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r980 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqm0(r980 r980Var, yje yjeVar) {
        super(yjeVar);
        this.j = r980Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
