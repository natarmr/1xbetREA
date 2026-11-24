package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ih7 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ na k;
    public kmq l;
    public List m;
    public List n;
    public Iterator o;
    public List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih7(na naVar, yje yjeVar) {
        super(yjeVar);
        this.k = naVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
