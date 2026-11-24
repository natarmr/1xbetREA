package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qh80 extends zje {
    public Function2 i;
    public rh80 j;
    public gp00 k;
    public Collection l;
    public Iterator m;
    public kls0 n;
    public int[] o;
    public Collection p;
    public Iterator q;
    public Collection r;
    public Collection s;
    public /* synthetic */ Object t;
    public final /* synthetic */ rh80 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh80(rh80 rh80Var, zje zjeVar) {
        super(zjeVar);
        this.u = rh80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(this, null);
    }
}
