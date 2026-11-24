package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class gag0 extends zje {
    public Collection i;
    public Iterator j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ywu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gag0(ywu ywuVar, zje zjeVar) {
        super(zjeVar);
        this.m = ywuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.w(this);
    }
}
