package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wp7 extends zje {
    public int i;
    public int j;
    public zri k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xp7 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp7(xp7 xp7Var, zje zjeVar) {
        super(zjeVar);
        this.m = xp7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}
