package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class oxs0 extends zje {
    public Iterator i;
    public String j;
    public o9c k;
    public /* synthetic */ Object l;
    public final /* synthetic */ r6d m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxs0(r6d r6dVar, yje yjeVar) {
        super(yjeVar);
        this.m = r6dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
