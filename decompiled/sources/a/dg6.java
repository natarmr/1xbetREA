package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dg6 {
    public static final cg6 Companion = new cg6();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o85(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg6 f6032a;
    public final List b;

    public /* synthetic */ dg6(int i, gg6 gg6Var, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, bg6.f2539a.getDescriptor());
            throw null;
        }
        this.f6032a = gg6Var;
        this.b = list;
    }

    public dg6(gg6 gg6Var, ArrayList arrayList) {
        this.f6032a = gg6Var;
        this.b = arrayList;
    }
}
