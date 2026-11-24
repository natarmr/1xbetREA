package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pom extends zje {
    public float i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tom k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pom(tom tomVar, zje zjeVar) {
        super(zjeVar);
        this.k = tomVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f1(0.0f, this);
    }
}
