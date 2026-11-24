package a;

/* JADX INFO: loaded from: classes.dex */
public final class nfx extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ aot j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfx(aot aotVar, zje zjeVar) {
        super(zjeVar);
        this.j = aotVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
