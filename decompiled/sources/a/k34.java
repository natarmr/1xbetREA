package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17601a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final m24 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public k34(j34 j34Var) {
        this.f17601a = j34Var.f15813a;
        this.b = j34Var.b;
        this.c = j34Var.c;
        this.d = j34Var.d;
        this.e = j34Var.e;
        this.f = j34Var.f;
        this.g = j34Var.g;
        this.h = j34Var.h;
        this.i = j34Var.i;
        this.j = j34Var.j;
        this.k = j34Var.k;
    }

    public final j34 a() {
        j34 j34Var = new j34();
        j34Var.f15813a = this.f17601a;
        j34Var.b = this.b;
        j34Var.c = this.c;
        j34Var.d = this.d;
        j34Var.e = this.e;
        j34Var.f = this.f;
        j34Var.g = this.g;
        j34Var.h = this.h;
        j34Var.i = this.i;
        j34Var.j = this.j;
        j34Var.k = this.k;
        return j34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k34.class != obj.getClass()) {
            return false;
        }
        k34 k34Var = (k34) obj;
        return this.f17601a == k34Var.f17601a && this.b == k34Var.b && this.c == k34Var.c && this.d == k34Var.d && this.e == k34Var.e && this.f == k34Var.f && this.h == k34Var.h && this.i == k34Var.i && this.j == k34Var.j && this.k == k34Var.k && this.g.equals(k34Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17601a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
