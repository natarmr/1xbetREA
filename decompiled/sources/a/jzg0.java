package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17411a;
    public final int b;
    public final int c;

    public jzg0(int i, int i2, Object obj) {
        this.f17411a = obj;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzg0)) {
            return false;
        }
        jzg0 jzg0Var = (jzg0) obj;
        return Intrinsics.d(this.f17411a, jzg0Var.f17411a) && this.b == jzg0Var.b && this.c == jzg0Var.c;
    }

    public final int hashCode() {
        Object obj = this.f17411a;
        return Integer.hashCode(this.c) + twn.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedEntry(key=");
        sb.append(this.f17411a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", offset=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
