package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yc4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42367a;
    public final String b;

    public yc4(Integer num, String str) {
        str.getClass();
        this.f42367a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc4)) {
            return false;
        }
        yc4 yc4Var = (yc4) obj;
        return this.f42367a.equals(yc4Var.f42367a) && Intrinsics.d(this.b, yc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42367a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.f(this.f42367a, "HandleServerError(code=", ", message=", this.b, Separators.RPAREN);
    }
}
