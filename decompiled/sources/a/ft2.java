package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ft2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10090a;
    public final bmq0 b;
    public final int c;
    public final vn30 d;
    public final long e;
    public final bmq0 f;
    public final int g;
    public final vn30 h;
    public final long i;
    public final long j;

    public ft2(long j, bmq0 bmq0Var, int i, vn30 vn30Var, long j2, bmq0 bmq0Var2, int i2, vn30 vn30Var2, long j3, long j4) {
        this.f10090a = j;
        this.b = bmq0Var;
        this.c = i;
        this.d = vn30Var;
        this.e = j2;
        this.f = bmq0Var2;
        this.g = i2;
        this.h = vn30Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ft2.class != obj.getClass()) {
            return false;
        }
        ft2 ft2Var = (ft2) obj;
        return this.f10090a == ft2Var.f10090a && this.c == ft2Var.c && this.e == ft2Var.e && this.g == ft2Var.g && this.i == ft2Var.i && this.j == ft2Var.j && this.b.equals(ft2Var.b) && Objects.equals(this.d, ft2Var.d) && Objects.equals(this.f, ft2Var.f) && Objects.equals(this.h, ft2Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f10090a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
