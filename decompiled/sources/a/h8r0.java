package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h8r0 extends zje {
    public List i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ w5z l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8r0(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.l = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.B(null, 0, this);
    }
}
