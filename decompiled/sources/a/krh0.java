package a;

/* JADX INFO: loaded from: classes5.dex */
public final class krh0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jof0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krh0(jof0 jof0Var, zje zjeVar) {
        super(zjeVar);
        this.k = jof0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
