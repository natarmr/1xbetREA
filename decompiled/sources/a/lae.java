package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lae extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ vae j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lae(vae vaeVar, zje zjeVar) {
        super(zjeVar);
        this.j = vaeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, this);
    }
}
