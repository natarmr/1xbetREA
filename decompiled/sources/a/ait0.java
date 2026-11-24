package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ait0 extends zje {
    public q4f i;
    public cit0 j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ lri m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ait0(lri lriVar, zje zjeVar) {
        super(zjeVar);
        this.m = lriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, null, null, null, this);
    }
}
