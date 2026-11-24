package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xsa0 extends zje {
    public daf i;
    public g4z j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ysa0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsa0(ysa0 ysa0Var, yje yjeVar) {
        super(yjeVar);
        this.l = ysa0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
