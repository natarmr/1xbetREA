package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class we00 extends zje {
    public Map i;
    public List j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ poz m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we00(poz pozVar, yje yjeVar) {
        super(yjeVar);
        this.m = pozVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
