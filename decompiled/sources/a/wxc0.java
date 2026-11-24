package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wxc0 extends zje {
    public String i;
    public String j;
    public jo20 k;
    public jo20 l;
    public String m;
    public jo20 n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ayc0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxc0(ayc0 ayc0Var, zje zjeVar) {
        super(zjeVar);
        this.q = ayc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.M(null, this);
    }
}
