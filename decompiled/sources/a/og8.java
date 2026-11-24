package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class og8 implements pg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25204a;
    public final String b;

    public og8(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f25204a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og8)) {
            return false;
        }
        og8 og8Var = (og8) obj;
        return Intrinsics.d(this.f25204a, og8Var.f25204a) && Intrinsics.d(this.b, og8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25204a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Rules(descriptionFirstRule=", this.f25204a, ", descriptionSecondRule=", this.b, Separators.RPAREN);
    }
}
