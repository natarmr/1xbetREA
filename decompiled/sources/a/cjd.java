package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cjd extends zje {
    public ctc i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hjd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjd(hjd hjdVar, zje zjeVar) {
        super(zjeVar);
        this.k = hjdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(null, null, null, this);
    }
}
