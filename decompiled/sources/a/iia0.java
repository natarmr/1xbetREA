package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class iia0 {
    public static final hia0 Companion = new hia0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14820a;
    public final List b;
    public final bia0 c;

    static {
        aia0 aia0Var = bia0.Companion;
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new raa0((byte) 21)), maz.a(wezVar, new raa0((byte) 22)), null};
    }

    public /* synthetic */ iia0(int i, List list, List list2, bia0 bia0Var) {
        if ((i & 1) == 0) {
            this.f14820a = null;
        } else {
            this.f14820a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bia0Var;
        }
    }
}
