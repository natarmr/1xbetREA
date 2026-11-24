package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qr60 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ xu3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr60(xu3 xu3Var, yje yjeVar) {
        super(yjeVar);
        this.k = xu3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
