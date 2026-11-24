package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uh80 extends zje {
    public Function2 i;
    public Collection j;
    public Iterator k;
    public Collection l;
    public /* synthetic */ Object m;
    public final /* synthetic */ vh80 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh80(vh80 vh80Var, zje zjeVar) {
        super(zjeVar);
        this.n = vh80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(this, null);
    }
}
