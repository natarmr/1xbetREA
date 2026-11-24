package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19152a;
    public final int b;
    public final int c;

    public kzg0(int i, int i2, Object obj) {
        this.f19152a = obj;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzg0)) {
            return false;
        }
        kzg0 kzg0Var = (kzg0) obj;
        return Intrinsics.d(this.f19152a, kzg0Var.f19152a) && this.b == kzg0Var.b && this.c == kzg0Var.c;
    }

    public final int hashCode() {
        Object obj = this.f19152a;
        return Integer.hashCode(this.c) + twn.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedEntry(key=");
        sb.append(this.f19152a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", offset=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
