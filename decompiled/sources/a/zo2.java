package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zo2 {
    public static final yo2 Companion = new yo2();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44698a;
    public final String b;
    public final kuw c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new t32((byte) 16)), null, maz.a(wezVar, new t32((byte) 17))};
    }

    public /* synthetic */ zo2(int i, List list, String str, kuw kuwVar) {
        if ((i & 1) == 0) {
            this.f44698a = null;
        } else {
            this.f44698a = list;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kuwVar;
        }
    }
}
