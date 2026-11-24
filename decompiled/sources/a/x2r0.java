package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x2r0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ r6d k;
    public kmq l;
    public List m;
    public Collection n;
    public Iterator o;
    public b4r0 p;
    public Collection q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2r0(r6d r6dVar, yje yjeVar) {
        super(yjeVar);
        this.k = r6dVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
