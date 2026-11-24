package a;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class me8 extends zje {
    public Context i;
    public gbe0 j;
    public Iterator k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ln4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me8(ln4 ln4Var, zje zjeVar) {
        super(zjeVar);
        this.m = ln4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
