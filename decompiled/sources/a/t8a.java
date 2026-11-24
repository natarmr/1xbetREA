package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t8a extends zje {
    public List i;
    public i8a j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g9a n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8a(g9a g9aVar, zje zjeVar) {
        super(zjeVar);
        this.n = g9aVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.h(null, 0, 0, 0, null, this);
    }
}
