package a;

/* JADX INFO: loaded from: classes4.dex */
public final class equ extends zje {
    public h8e0 i;
    public int j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ edu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public equ(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.m = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(null, 0, null, 0, this);
    }
}
