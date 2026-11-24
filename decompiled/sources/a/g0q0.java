package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class g0q0 {
    public static final f0q0 Companion = new f0q0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10471a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new ozp0((byte) 1)), maz.a(wezVar, new ozp0((byte) 2))};
    }

    public /* synthetic */ g0q0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f10471a = null;
        } else {
            this.f10471a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
