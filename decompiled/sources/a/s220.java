package a;

/* JADX INFO: loaded from: classes3.dex */
public final class s220 extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w220 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s220(w220 w220Var, zje zjeVar) {
        super(zjeVar);
        this.k = w220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.J(this);
    }
}
