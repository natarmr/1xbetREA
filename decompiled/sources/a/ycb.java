package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ycb extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xex j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycb(xex xexVar, zje zjeVar) {
        super(zjeVar);
        this.j = xexVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.A(0, 0, 0, 0, null, this);
    }
}
