package a;

/* JADX INFO: loaded from: classes3.dex */
public final class keu extends zje {
    public boolean i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cdu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keu(cdu cduVar, yje yjeVar) {
        super(yjeVar);
        this.l = cduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(false, 0, null, false, this);
    }
}
