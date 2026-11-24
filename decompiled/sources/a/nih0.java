package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nih0 extends zje {
    public dxk0 i;
    public cxk0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sih0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nih0(sih0 sih0Var, zje zjeVar) {
        super(zjeVar);
        this.l = sih0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(null, null, this);
    }
}
