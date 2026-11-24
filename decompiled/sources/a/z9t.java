package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class z9t {
    public static final y9t Companion = new y9t();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f44037a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;
    public final List f;
    public final Boolean g;
    public final l9t h;
    public final l9t i;
    public final l9t j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, maz.a(wezVar, new e6t((byte) 11)), null, null, null, maz.a(wezVar, new e6t((byte) 12)), null, null, null, null};
    }

    public /* synthetic */ z9t(int i, Integer num, List list, Integer num2, Integer num3, Boolean bool, List list2, Boolean bool2, l9t l9tVar, l9t l9tVar2, l9t l9tVar3) {
        if ((i & 1) == 0) {
            this.f44037a = null;
        } else {
            this.f44037a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l9tVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l9tVar2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l9tVar3;
        }
    }
}
