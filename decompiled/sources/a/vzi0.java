package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vzi0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ wzi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzi0(wzi0 wzi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = wzi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
