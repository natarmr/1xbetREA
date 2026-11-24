package a;

/* JADX INFO: loaded from: classes4.dex */
public final class szu extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ pqu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szu(pqu pquVar, yje yjeVar) {
        super(yjeVar);
        this.k = pquVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
