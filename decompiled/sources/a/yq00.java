package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yq00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43053a;
    public final float b;
    public final long c;

    public yq00(xq00 xq00Var) {
        this.f43053a = xq00Var.f41291a;
        this.b = xq00Var.b;
        this.c = xq00Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq00)) {
            return false;
        }
        yq00 yq00Var = (yq00) obj;
        return this.f43053a == yq00Var.f43053a && this.b == yq00Var.b && this.c == yq00Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f43053a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
