package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cst extends zje {
    public int i;
    public List j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dst m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cst(dst dstVar, zje zjeVar) {
        super(zjeVar);
        this.m = dstVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0, this);
    }
}
