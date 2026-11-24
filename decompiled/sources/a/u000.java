package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u000 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34831a;
    public final String b;

    public u000(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34831a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u000)) {
            return false;
        }
        u000 u000Var = (u000) obj;
        return Intrinsics.d(this.f34831a, u000Var.f34831a) && Intrinsics.d(this.b, u000Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34831a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LimitsNeLockScreenState(title=", this.f34831a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
