package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zpt extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public gm3 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nmo o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpt(nmo nmoVar, zje zjeVar) {
        super(zjeVar);
        this.o = nmoVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(false, false, null, false, null, 0, this);
    }
}
