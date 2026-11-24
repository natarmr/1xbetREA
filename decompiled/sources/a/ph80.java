package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ph80 extends zje {
    public Function2 i;
    public rh80 j;
    public gp00 k;
    public Collection l;
    public Iterator m;
    public kls0 n;
    public List o;
    public List p;
    public Iterator q;
    public Object r;
    public Collection s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ rh80 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph80(rh80 rh80Var, zje zjeVar) {
        super(zjeVar);
        this.w = rh80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
