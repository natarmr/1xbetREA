package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qoi0 extends zje {
    public j4g i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y1u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoi0(y1u y1uVar, zje zjeVar) {
        super(zjeVar);
        this.k = y1uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
