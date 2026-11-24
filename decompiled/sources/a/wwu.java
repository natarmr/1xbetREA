package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wwu extends zje {
    public xsu i;
    public String j;
    public boolean k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ yhi o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwu(yhi yhiVar, zje zjeVar) {
        super(zjeVar);
        this.o = yhiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(0, 0L, this, null, false);
    }
}
