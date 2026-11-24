package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ayt extends zje {
    public boolean i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ iqi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayt(iqi iqiVar, zje zjeVar) {
        super(zjeVar);
        this.m = iqiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(this, null, false);
    }
}
