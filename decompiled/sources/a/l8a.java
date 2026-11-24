package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l8a extends zje {
    public i8a i;
    public List j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g9a m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.m = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, 0, 0, null, this);
    }
}
