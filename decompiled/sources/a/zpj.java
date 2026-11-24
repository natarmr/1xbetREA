package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zpj extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ erj j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.j = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
