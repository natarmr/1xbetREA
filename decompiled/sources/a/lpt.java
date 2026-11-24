package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lpt extends zje {
    public boolean i;
    public List j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ali m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpt(ali aliVar, yje yjeVar) {
        super(yjeVar);
        this.m = aliVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.r(false, this);
    }
}
