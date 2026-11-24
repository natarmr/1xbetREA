package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class yx20 extends zje {
    public Collection i;
    public Iterator j;
    public kx20 k;
    public mx20 l;
    public Collection m;
    public /* synthetic */ Object n;
    public final /* synthetic */ dy20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx20(dy20 dy20Var, zje zjeVar) {
        super(zjeVar);
        this.o = dy20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.x(null, this);
    }
}
