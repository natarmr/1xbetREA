package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cv60 extends zje {
    public List i;
    public jza j;
    public Map k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hv60 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv60(hv60 hv60Var, zje zjeVar) {
        super(zjeVar);
        this.m = hv60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.P(this);
    }
}
