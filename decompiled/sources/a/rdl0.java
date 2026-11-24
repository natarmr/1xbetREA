package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rdl0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tdl0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdl0(tdl0 tdl0Var, zje zjeVar) {
        super(zjeVar);
        this.j = tdl0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objA = this.j.a(null, null, false, false, 0, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
