package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s2h extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ yj2 k;
    public List l;
    public kmq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2h(yj2 yj2Var, yje yjeVar) {
        super(yjeVar);
        this.k = yj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
