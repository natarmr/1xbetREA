package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class we30 {
    public static final je30 Companion = new je30();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39000a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new n230((byte) 16)), maz.a(wezVar, new n230((byte) 17)), maz.a(wezVar, new n230((byte) 18))};
    }

    public /* synthetic */ we30(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f39000a = null;
        } else {
            this.f39000a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }
}
