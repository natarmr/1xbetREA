package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f220 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ w120 k;
    public kmq l;
    public usr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f220(w120 w120Var, yje yjeVar) {
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
