package a;

/* JADX INFO: loaded from: classes5.dex */
public final class z2d extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f3d j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2d(f3d f3dVar, zje zjeVar) {
        super(zjeVar);
        this.j = f3dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
