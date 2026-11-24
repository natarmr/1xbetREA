package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class n0q0 {
    public static final m0q0 Companion = new m0q0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22712a;
    public final Integer b;
    public final g0q0 c;

    static {
        f0q0 f0q0Var = g0q0.Companion;
        d = new a8z[]{maz.a(wez.f39042a, new ozp0((byte) 3)), null, null};
    }

    public /* synthetic */ n0q0(int i, List list, Integer num, g0q0 g0q0Var) {
        if ((i & 1) == 0) {
            this.f22712a = null;
        } else {
            this.f22712a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = g0q0Var;
        }
    }
}
