package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lwt extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zri k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwt(zri zriVar, zje zjeVar) {
        super(zjeVar);
        this.k = zriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(null, null, this);
    }
}
