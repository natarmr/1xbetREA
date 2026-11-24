package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class oc60 extends zje {
    public ArrayList i;
    public HashMap j;
    public Map k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pzu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc60(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.m = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.s0(null, null, 0L, 0L, this);
    }
}
