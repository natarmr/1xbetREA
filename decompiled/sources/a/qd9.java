package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qd9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd9 f28524a;
    public final int b;
    public final int c;

    public qd9(nd9 nd9Var, int i, int i2) {
        this.f28524a = nd9Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd9)) {
            return false;
        }
        qd9 qd9Var = (qd9) obj;
        return Intrinsics.d(this.f28524a, qd9Var.f28524a) && this.b == qd9Var.b && this.c == qd9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f28524a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.f28524a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
