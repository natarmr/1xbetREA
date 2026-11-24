package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u5f extends zje {
    public List i;
    public List j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ r7f m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.m = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.Q(null, null, false, this);
    }
}
