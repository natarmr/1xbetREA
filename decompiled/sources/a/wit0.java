package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wit0 extends zje {
    public q4f i;
    public List j;
    public ArrayList k;
    public ArrayList l;
    public oif0 m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vit0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wit0(vit0 vit0Var, zje zjeVar) {
        super(zjeVar);
        this.p = vit0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, false, this);
    }
}
