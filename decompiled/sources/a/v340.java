package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v340 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36717a;
    public final long b;

    public v340(t16 t16Var) {
        String str = t16Var.b;
        if (str == null) {
            jf4.k(null);
            throw null;
        }
        Long l = t16Var.c;
        long jLongValue = l != null ? l.longValue() : -1L;
        this.f36717a = str;
        this.b = jLongValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v340)) {
            return false;
        }
        v340 v340Var = (v340) obj;
        return Intrinsics.d(this.f36717a, v340Var.f36717a) && this.b == v340Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f36717a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Message(message=", this.f36717a, ", messageId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
