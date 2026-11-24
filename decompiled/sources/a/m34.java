package a;

/* JADX INFO: loaded from: classes.dex */
public final class m34 extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o34 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m34(o34 o34Var, zje zjeVar) {
        super(zjeVar);
        this.k = o34Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
