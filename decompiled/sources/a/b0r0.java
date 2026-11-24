package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b0r0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ xzq0 k;
    public kmq l;
    public List m;
    public ArrayList n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0r0(xzq0 xzq0Var, yje yjeVar) {
        super(yjeVar);
        this.k = xzq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
