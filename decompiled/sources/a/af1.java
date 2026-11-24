package a;

/* JADX INFO: loaded from: classes2.dex */
public final class af1 extends zje {
    public String i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qgd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af1(qgd qgdVar, zje zjeVar) {
        super(zjeVar);
        this.l = qgdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.F(0, 0, null, false, 0, 0, this);
    }
}
