package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t5e extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ c6e j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5e(c6e c6eVar, zje zjeVar) {
        super(zjeVar);
        this.j = c6eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(this);
    }
}
