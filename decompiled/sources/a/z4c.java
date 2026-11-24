package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z4c extends zje {
    public ts4 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c5k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4c(c5k c5kVar, zje zjeVar) {
        super(zjeVar);
        this.k = c5kVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(this);
    }
}
