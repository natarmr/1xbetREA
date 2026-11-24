package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class l9t {
    public static final k9t Companion = new k9t();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19672a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new e6t((byte) 8)), maz.a(wezVar, new e6t((byte) 9))};
    }

    public /* synthetic */ l9t(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f19672a = null;
        } else {
            this.f19672a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
