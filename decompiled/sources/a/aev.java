package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aev extends zje {
    public List i;
    public udv j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ bev n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aev(bev bevVar, yje yjeVar) {
        super(yjeVar);
        this.n = bevVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.n(null, this);
    }
}
