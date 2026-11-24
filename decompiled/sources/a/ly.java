package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ly {
    public static final ky Companion = new ky();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20840a;
    public final String b;
    public final kuw c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new q8((byte) 18)), null, maz.a(wezVar, new q8((byte) 19))};
    }

    public /* synthetic */ ly(int i, List list, String str, kuw kuwVar) {
        if ((i & 1) == 0) {
            this.f20840a = null;
        } else {
            this.f20840a = list;
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
