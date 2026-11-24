package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pc60 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ji3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc60(ji3 ji3Var, yje yjeVar) {
        super(yjeVar);
        this.k = ji3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
