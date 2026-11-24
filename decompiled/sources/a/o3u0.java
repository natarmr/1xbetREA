package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class o3u0 {
    public static final n3u0 Companion = new n3u0();
    public static final a8z[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24603a;
    public final String b;
    public final ywp0 c;
    public final List d;
    public final String e;
    public final List f;

    static {
        wez wezVar = wez.f39042a;
        g = new a8z[]{null, null, null, maz.a(wezVar, new o1u0((byte) 5)), null, maz.a(wezVar, new o1u0((byte) 6))};
    }

    public /* synthetic */ o3u0(int i, String str, String str2, ywp0 ywp0Var, List list, String str3, List list2) {
        if ((i & 1) == 0) {
            this.f24603a = null;
        } else {
            this.f24603a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ywp0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }
}
