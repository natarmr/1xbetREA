package a;

/* JADX INFO: loaded from: classes4.dex */
public final class slg extends zje {
    public qlg i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ulg k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slg(ulg ulgVar, zje zjeVar) {
        super(zjeVar);
        this.k = ulgVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
