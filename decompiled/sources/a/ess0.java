package a;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class ess0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8346a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public s5q0 r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(ess0 ess0Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ess0Var != null) {
            if (!this.c && ess0Var.c) {
                this.b = ess0Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = ess0Var.h;
            }
            if (this.i == -1) {
                this.i = ess0Var.i;
            }
            if (this.f8346a == null && (str = ess0Var.f8346a) != null) {
                this.f8346a = str;
            }
            if (this.f == -1) {
                this.f = ess0Var.f;
            }
            if (this.g == -1) {
                this.g = ess0Var.g;
            }
            if (this.n == -1) {
                this.n = ess0Var.n;
            }
            if (this.o == null && (alignment2 = ess0Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ess0Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ess0Var.q;
            }
            if (this.j == -1) {
                this.j = ess0Var.j;
                this.k = ess0Var.k;
            }
            if (this.r == null) {
                this.r = ess0Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ess0Var.s;
            }
            if (this.t == null) {
                this.t = ess0Var.t;
            }
            if (this.u == null) {
                this.u = ess0Var.u;
            }
            if (this.v == null) {
                this.v = ess0Var.v;
            }
            if (!this.e && ess0Var.e) {
                this.d = ess0Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = ess0Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
