package a;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class la extends zje {
    public Map i;
    public p7m0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ na m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(na naVar, yje yjeVar) {
        super(yjeVar);
        this.m = naVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
