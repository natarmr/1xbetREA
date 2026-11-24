package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tkl0 {
    public static final jkl0 Companion = new jkl0();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f34100a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final List f;
    public final cfl0 g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, null, null, maz.a(wezVar, new fzk0((byte) 8)), null, maz.a(wezVar, new fzk0((byte) 10))};
    }

    public /* synthetic */ tkl0(int i2, Long l, String str, String str2, String str3, Boolean bool, List list, cfl0 cfl0Var, List list2) {
        if ((i2 & 1) == 0) {
            this.f34100a = null;
        } else {
            this.f34100a = l;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = cfl0Var;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
    }
}
