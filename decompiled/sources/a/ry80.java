package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ry80 extends zje {
    public String i;
    public List j;
    public Collection k;
    public Iterator l;
    public String m;
    public List n;
    public Collection o;
    public /* synthetic */ Object p;
    public final /* synthetic */ y3v q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry80(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.q = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.o(null, this);
    }
}
