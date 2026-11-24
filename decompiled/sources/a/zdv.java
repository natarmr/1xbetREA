package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zdv extends zje {
    public List i;
    public udv j;
    public kie0 k;
    public List l;
    public udv m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ bev q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdv(bev bevVar, yje yjeVar) {
        super(yjeVar);
        this.q = bevVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.l(null, 0, null, this);
    }
}
