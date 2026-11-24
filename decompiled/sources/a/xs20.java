package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xs20 {
    public static final ws20 Companion = new ws20();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41394a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new sv10((byte) 23)), maz.a(wezVar, new sv10((byte) 24))};
    }

    public /* synthetic */ xs20(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f41394a = null;
        } else {
            this.f41394a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
