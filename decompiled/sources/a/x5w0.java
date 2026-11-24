package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class x5w0 extends zje {
    public String i;
    public Collection j;
    public Iterator k;
    public Collection l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b6w0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5w0(b6w0 b6w0Var, zje zjeVar) {
        super(zjeVar);
        this.n = b6w0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
