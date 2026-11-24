package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w980 extends zje {
    public Integer i;
    public aa80 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ aa80 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w980(aa80 aa80Var, zje zjeVar) {
        super(zjeVar);
        this.l = aa80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.y(null, null, null, this);
    }
}
