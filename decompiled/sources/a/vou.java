package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vou extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wou k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vou(wou wouVar, zje zjeVar) {
        super(zjeVar);
        this.k = wouVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
