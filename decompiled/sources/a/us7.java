package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class us7 {
    public static final qs7 Companion = new qs7();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36197a;
    public final String b;
    public final List c;
    public final List d;
    public final Boolean e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, maz.a(wezVar, new os7((byte) 0)), maz.a(wezVar, new os7((byte) 1)), null};
    }

    public /* synthetic */ us7(int i, String str, String str2, List list, List list2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f36197a = null;
        } else {
            this.f36197a = str;
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
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }
}
