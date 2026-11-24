package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ouv0 extends zje {
    public float i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ruv0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouv0(ruv0 ruv0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ruv0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0.0f, this);
    }
}
