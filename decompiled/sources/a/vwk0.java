package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vwk0 extends zje {
    public int i;
    public bvc j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ yhi n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwk0(yhi yhiVar, zje zjeVar) {
        super(zjeVar);
        this.n = yhiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(0, null, null, false, this);
    }
}
