package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ah6 {
    public static final ng6 Companion = new ng6();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new lg6(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg6 f858a;
    public final List b;

    public /* synthetic */ ah6(int i, qg6 qg6Var, List list) {
        if ((i & 1) == 0) {
            this.f858a = null;
        } else {
            this.f858a = qg6Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
