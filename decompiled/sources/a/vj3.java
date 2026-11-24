package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vj3 extends zje {
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lhf0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj3(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.l = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, null, this);
    }
}
