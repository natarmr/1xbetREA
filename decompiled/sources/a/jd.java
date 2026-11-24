package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jd {
    public static final id Companion = new id();
    public static final a8z[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f16304a;
    public final Long b;
    public final String c;
    public final String d;
    public final muf e;
    public final Integer f;
    public final List g;
    public final String h;
    public final ywp0 i;
    public final yvq j;
    public final List k;
    public final Boolean l;
    public final List m;
    public final List n;

    static {
        wez wezVar = wez.f39042a;
        o = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new q8((byte) 3)), null, null, null, maz.a(wezVar, new q8((byte) 4)), null, maz.a(wezVar, new q8((byte) 5)), maz.a(wezVar, new q8((byte) 6))};
    }

    public jd(int i, Long l, Long l2, String str, String str2, muf mufVar, Integer num, List list, String str3, ywp0 ywp0Var, yvq yvqVar, List list2, Boolean bool, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f16304a = null;
        } else {
            this.f16304a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = mufVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = ywp0Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = yvqVar;
        }
        if ((i & 1024) == 0) {
            this.k = iun.f15405a;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list4;
        }
    }
}
