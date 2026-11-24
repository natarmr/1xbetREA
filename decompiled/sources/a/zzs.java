package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zzs extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ c0t j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(c0t c0tVar, zje zjeVar) {
        super(zjeVar);
        this.j = c0tVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
