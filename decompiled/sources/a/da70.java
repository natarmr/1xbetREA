package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class da70 extends zje {
    public Function2 i;
    public Iterator j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ea70 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da70(ea70 ea70Var, zje zjeVar) {
        super(zjeVar);
        this.m = ea70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
