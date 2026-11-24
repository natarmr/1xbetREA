package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class bd90 {
    public static final uc90 Companion = new uc90();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new i280(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc90 f2388a;
    public final List b;

    public /* synthetic */ bd90(int i, xc90 xc90Var, List list) {
        if ((i & 1) == 0) {
            this.f2388a = null;
        } else {
            this.f2388a = xc90Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
