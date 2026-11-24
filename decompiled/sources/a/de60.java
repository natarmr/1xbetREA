package a;

/* JADX INFO: loaded from: classes.dex */
public final class de60 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ s2g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de60(s2g s2gVar, zje zjeVar) {
        super(zjeVar);
        this.j = s2gVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.a(null, this);
        return wne.f39444a;
    }
}
