package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rae extends zje {
    public String i;
    public i050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vae l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rae(vae vaeVar, zje zjeVar) {
        super(zjeVar);
        this.l = vaeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, null, this);
    }
}
