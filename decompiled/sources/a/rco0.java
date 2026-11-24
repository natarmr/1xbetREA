package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rco0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ sco0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rco0(sco0 sco0Var, yje yjeVar) {
        super(yjeVar);
        this.k = sco0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
