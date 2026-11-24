package a;

/* JADX INFO: loaded from: classes.dex */
public final class s4e extends zje {
    public mie0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t4e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4e(t4e t4eVar, zje zjeVar) {
        super(zjeVar);
        this.k = t4eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(this);
    }
}
