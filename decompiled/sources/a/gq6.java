package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gq6 {
    public static final fq6 Companion = new fq6();
    public static final a8z[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11716a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final Long h;
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;

    static {
        wez wezVar = wez.f39042a;
        r = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new lg6((byte) 10)), maz.a(wezVar, new lg6((byte) 11)), maz.a(wezVar, new lg6((byte) 12)), maz.a(wezVar, new lg6((byte) 13))};
    }

    public /* synthetic */ gq6(int i, String str, Integer num, String str2, String str3, Double d, Double d2, Double d3, Long l, String str4, Integer num2, String str5, String str6, String str7, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f11716a = null;
        } else {
            this.f11716a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list3;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = list4;
        }
    }
}
