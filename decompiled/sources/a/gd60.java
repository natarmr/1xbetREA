package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gd60 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ eu4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd60(eu4 eu4Var, yje yjeVar) {
        super(yjeVar);
        this.k = eu4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
