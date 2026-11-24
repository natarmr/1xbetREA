package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jy70 extends zje {
    public String i;
    public jcl j;
    public String k;
    public String l;
    public String m;
    public String n;
    public rl40 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ gz70 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy70(gz70 gz70Var, zje zjeVar) {
        super(zjeVar);
        this.q = gz70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
