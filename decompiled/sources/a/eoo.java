package a;

/* JADX INFO: loaded from: classes4.dex */
public final class eoo extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ boo k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoo(boo booVar, yje yjeVar) {
        super(yjeVar);
        this.k = booVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
