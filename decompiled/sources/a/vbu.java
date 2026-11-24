package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vbu extends zje {
    public List i;
    public z9s j;
    public List k;
    public List l;
    public Collection m;
    public Iterator n;
    public nas o;
    public Collection p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ v7i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbu(v7i v7iVar, zje zjeVar) {
        super(zjeVar);
        this.v = v7iVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, null, false, null, false, false, false, this);
    }
}
