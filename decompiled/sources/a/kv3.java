package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kv3 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ov3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv3(ov3 ov3Var, zje zjeVar) {
        super(zjeVar);
        this.j = ov3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
