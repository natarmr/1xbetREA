package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kkt0 extends zje {
    public ArrayList i;
    public List j;
    public ArrayList k;
    public ArrayList l;
    public Object m;
    public ArrayList n;
    public /* synthetic */ Object o;
    public final /* synthetic */ fuj0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkt0(fuj0 fuj0Var, zje zjeVar) {
        super(zjeVar);
        this.p = fuj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.x(this);
    }
}
