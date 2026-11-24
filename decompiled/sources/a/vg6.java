package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vg6 {
    public static final ug6 Companion = new ug6();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37367a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new lg6((byte) 1)), maz.a(wezVar, new lg6((byte) 2))};
    }

    public /* synthetic */ vg6(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f37367a = null;
        } else {
            this.f37367a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
