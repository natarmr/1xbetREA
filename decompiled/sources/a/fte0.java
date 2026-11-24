package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fte0 extends zje {
    public ynb0 i;
    public String j;
    public ts4 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jnk m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fte0(jnk jnkVar, zje zjeVar) {
        super(zjeVar);
        this.m = jnkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this, null, null);
    }
}
