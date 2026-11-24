package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kge0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lge0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kge0(lge0 lge0Var, zje zjeVar) {
        super(zjeVar);
        this.j = lge0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
