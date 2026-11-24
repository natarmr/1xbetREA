package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bjd extends zje {
    public vid i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hjd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjd(hjd hjdVar, yje yjeVar) {
        super(yjeVar);
        this.k = hjdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
