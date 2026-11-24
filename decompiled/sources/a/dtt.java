package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dtt extends zje {
    public x4u i;
    public String j;
    public boolean k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uii n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtt(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.n = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.B(null, null, this);
    }
}
