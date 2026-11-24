package a;

/* JADX INFO: loaded from: classes3.dex */
public final class enk extends zje {
    public ts4 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fnk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enk(fnk fnkVar, zje zjeVar) {
        super(zjeVar);
        this.k = fnkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
