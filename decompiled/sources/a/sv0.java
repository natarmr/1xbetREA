package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sv0 {
    public static final rv0 Companion = new rv0();
    public static final a8z[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f32844a;
    public final String b;
    public final String c;
    public final List d;
    public final Boolean e;
    public final Boolean f;
    public final Long g;
    public final String h;
    public final Integer i;
    public final Integer j;
    public final String k;
    public final Boolean l;
    public final Integer m;
    public final Boolean n;
    public final List o;
    public final Boolean p;

    static {
        wez wezVar = wez.f39042a;
        q = new a8z[]{null, null, null, maz.a(wezVar, new mg0((byte) 15)), null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new mg0((byte) 16)), null};
    }

    public /* synthetic */ sv0(int i, Long l, String str, String str2, List list, Boolean bool, Boolean bool2, Long l2, String str3, Integer num, Integer num2, String str4, Boolean bool3, Integer num3, Boolean bool4, List list2, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f32844a = null;
        } else {
            this.f32844a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list2;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = bool5;
        }
    }
}
