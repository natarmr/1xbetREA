package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dt20 {
    public static final ct20 Companion = new ct20();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new sv10(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final at20 f6642a;
    public final List b;

    public /* synthetic */ dt20(int i, at20 at20Var, List list) {
        if ((i & 1) == 0) {
            this.f6642a = null;
        } else {
            this.f6642a = at20Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
