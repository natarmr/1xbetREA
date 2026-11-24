package a;

/* JADX INFO: loaded from: classes4.dex */
public final class k3v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ jxt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3v(jxt jxtVar, yje yjeVar) {
        super(yjeVar);
        this.k = jxtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
