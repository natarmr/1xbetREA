package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class e6i0 {
    public static final c6i0 Companion = new c6i0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7286a;
    public final String b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, null, maz.a(wezVar, new igh0((byte) 22)), maz.a(wezVar, new igh0((byte) 24))};
    }

    public /* synthetic */ e6i0(int i, String str, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f7286a = null;
        } else {
            this.f7286a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }
}
