package a;

/* JADX INFO: loaded from: classes3.dex */
public final class su3 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ zu3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su3(zu3 zu3Var, zje zjeVar) {
        super(zjeVar);
        this.j = zu3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.z(this);
    }
}
