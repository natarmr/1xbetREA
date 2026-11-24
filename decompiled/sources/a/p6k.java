package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ar20 f26459a;
    public final int b;
    public final int c;
    public boolean d;
    public boolean e;
    public final char f;
    public int g;

    public p6k(ar20 ar20Var, int i, int i2, boolean z, boolean z2, char c) {
        ar20Var.getClass();
        this.f26459a = ar20Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = c;
        this.g = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6k)) {
            return false;
        }
        p6k p6kVar = (p6k) obj;
        return this.f26459a.equals(p6kVar.f26459a) && this.b == p6kVar.b && this.c == p6kVar.c && this.d == p6kVar.d && this.e == p6kVar.e && this.f == p6kVar.f && this.g == p6kVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((Character.hashCode(this.f) + brm0.e(brm0.e(twn.a(this.c, twn.a(this.b, this.f26459a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(tokenType=");
        sb.append(this.f26459a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", length=");
        sb.append(this.c);
        sb.append(", canOpen=");
        sb.append(this.d);
        sb.append(", canClose=");
        sb.append(this.e);
        sb.append(", marker=");
        sb.append(this.f);
        sb.append(", closerIndex=");
        return brm0.n(sb, this.g, ')');
    }
}
