package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class of30 {
    public static final ye30 Companion = new ye30();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25147a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new n230((byte) 21)), maz.a(wezVar, new n230((byte) 22))};
    }

    public /* synthetic */ of30(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f25147a = null;
        } else {
            this.f25147a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
