package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class lto extends c2 {
    public final /* synthetic */ qv5 c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lto(qv5 qv5Var, List list) {
        super((byte) 8);
        this.c = qv5Var;
        this.d = list;
    }

    @Override // a.c2
    public final int q(int i) {
        List listZ = this.c.z();
        listZ.getClass();
        p6t0 p6t0Var = (p6t0) CollectionsKt.W(i, listZ);
        if (p6t0Var != null) {
            return this.d.contains(sre0.f32672a.b(p6t0Var.getClass())) ? 1 : 2;
        }
        return 2;
    }
}
