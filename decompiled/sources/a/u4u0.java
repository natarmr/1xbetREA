package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u4u0 extends r4u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35069a;
    public final List b;
    public final int c;
    public final t89 d;
    public final float e;
    public final t89 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public u4u0(String str, List list, int i, t89 t89Var, float f, t89 t89Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f35069a = str;
        this.b = list;
        this.c = i;
        this.d = t89Var;
        this.e = f;
        this.f = t89Var2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u4u0.class != obj.getClass()) {
            return false;
        }
        u4u0 u4u0Var = (u4u0) obj;
        return this.f35069a.equals(u4u0Var.f35069a) && Intrinsics.d(this.d, u4u0Var.d) && this.e == u4u0Var.e && Intrinsics.d(this.f, u4u0Var.f) && this.g == u4u0Var.g && this.h == u4u0Var.h && this.i == u4u0Var.i && this.j == u4u0Var.j && this.k == u4u0Var.k && this.l == u4u0Var.l && this.m == u4u0Var.m && this.n == u4u0Var.n && this.c == u4u0Var.c && Intrinsics.d(this.b, u4u0Var.b);
    }

    public final int hashCode() {
        int iA = dw9.a(this.f35069a.hashCode() * 31, 31, this.b);
        t89 t89Var = this.d;
        int iA2 = defpackage.c.a((iA + (t89Var != null ? t89Var.hashCode() : 0)) * 31, this.e, 31);
        t89 t89Var2 = this.f;
        return Integer.hashCode(this.c) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(twn.a(this.j, twn.a(this.i, defpackage.c.a(defpackage.c.a((iA2 + (t89Var2 != null ? t89Var2.hashCode() : 0)) * 31, this.g, 31), this.h, 31), 31), 31), this.k, 31), this.l, 31), this.m, 31), this.n, 31);
    }
}
