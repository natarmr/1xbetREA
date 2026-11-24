package a;

/* JADX INFO: loaded from: classes3.dex */
public final class j220 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ w120 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j220(w120 w120Var, yje yjeVar) {
        super(yjeVar);
        this.k = w120Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
