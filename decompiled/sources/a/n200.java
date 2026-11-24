package a;

import java.util.Iterator;
import java.util.List;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class n200 extends zje {
    public LimitNeGroupEnum i;
    public List j;
    public Iterator k;
    public wrz l;
    public /* synthetic */ Object m;
    public final /* synthetic */ r200 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n200(r200 r200Var, zje zjeVar) {
        super(zjeVar);
        this.n = r200Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, this);
    }
}
