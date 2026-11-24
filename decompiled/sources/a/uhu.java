package a;

/* JADX INFO: loaded from: classes2.dex */
public final class uhu extends zje {
    public boolean i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zhu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhu(zhu zhuVar, zje zjeVar) {
        super(zjeVar);
        this.l = zhuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(false, false, this);
    }
}
