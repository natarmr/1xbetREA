package a;

/* JADX INFO: loaded from: classes.dex */
public final class oz3 extends zje {
    public o1x i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pz3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz3(pz3 pz3Var, zje zjeVar) {
        super(zjeVar);
        this.k = pz3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
