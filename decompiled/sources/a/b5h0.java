package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b5h0 {
    public static final u3h0 Companion = new u3h0();
    public static final a8z[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2004a;
    public final String b;
    public final i4h0 c;
    public final List d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final r4h0 h;
    public final String i;
    public final a5h0 j;
    public final String k;
    public final o4h0 l;
    public final Map m;
    public final Boolean n;
    public final x4h0 o;

    static {
        wez wezVar = wez.f39042a;
        p = new a8z[]{null, null, null, maz.a(wezVar, new yxg0((byte) 8)), null, null, null, null, null, null, null, null, maz.a(wezVar, new yxg0((byte) 10)), null, null};
    }

    public /* synthetic */ b5h0(int i, String str, String str2, i4h0 i4h0Var, List list, Integer num, Integer num2, Integer num3, r4h0 r4h0Var, String str3, a5h0 a5h0Var, String str4, o4h0 o4h0Var, Map map, Boolean bool, x4h0 x4h0Var) {
        if ((i & 1) == 0) {
            this.f2004a = null;
        } else {
            this.f2004a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = i4h0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = r4h0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = a5h0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = o4h0Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = map;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = x4h0Var;
        }
    }
}
