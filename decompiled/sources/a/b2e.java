package a;

/* JADX INFO: loaded from: classes3.dex */
public final class b2e extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d2e j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2e(d2e d2eVar, zje zjeVar) {
        super(zjeVar);
        this.j = d2eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
