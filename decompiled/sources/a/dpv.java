package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dpv {
    public static final vov Companion = new vov();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6483a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, maz.a(wezVar, new ldv((byte) 12)), maz.a(wezVar, new ldv((byte) 14)), maz.a(wezVar, new ldv((byte) 16))};
    }

    public /* synthetic */ dpv(int i, String str, String str2, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f6483a = null;
        } else {
            this.f6483a = str;
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
            this.e = list3;
        }
    }
}
