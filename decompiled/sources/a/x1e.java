package a;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class x1e extends zje {
    public Object i;
    public Serializable j;
    public hva0 k;
    public mie0 l;
    public CoroutineContext m;
    public mie0 n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ a2e q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1e(a2e a2eVar, zje zjeVar) {
        super(zjeVar);
        this.q = a2eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.m(false, null, this);
    }
}
