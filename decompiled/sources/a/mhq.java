package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mhq extends zje {
    public Map i;
    public Iterator j;
    public jki0 k;
    public Map l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nhq o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(nhq nhqVar, zje zjeVar) {
        super(zjeVar);
        this.o = nhqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(this);
    }
}
