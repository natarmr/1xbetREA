package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tn20 extends zje {
    public String i;
    public oa20 j;
    public r7v k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ wdu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn20(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.n = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.I(null, null, this);
    }
}
