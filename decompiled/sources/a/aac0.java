package a;

/* JADX INFO: loaded from: classes5.dex */
public final class aac0 extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ouu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aac0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.k = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(0, this, null);
    }
}
