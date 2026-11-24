package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vg70 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eh70 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg70(eh70 eh70Var, zje zjeVar) {
        super(zjeVar);
        this.k = eh70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(null, this);
    }
}
