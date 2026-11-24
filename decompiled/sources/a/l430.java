package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l430 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ clu k;
    public kmq l;
    public Collection m;
    public Iterator n;
    public ut20 o;
    public Collection p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l430(clu cluVar, yje yjeVar) {
        super(yjeVar);
        this.k = cluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
