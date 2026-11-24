package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zrl0 extends zje {
    public boolean i;
    public int j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ w5z m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrl0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.m = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.H(0, this, false);
    }
}
