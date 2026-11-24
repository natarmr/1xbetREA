package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13894a;
    public final String b;

    public hz7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13894a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz7)) {
            return false;
        }
        hz7 hz7Var = (hz7) obj;
        return Intrinsics.d(this.f13894a, hz7Var.f13894a) && Intrinsics.d(this.b, hz7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13894a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("BigPigDescriptions(first=", this.f13894a, ", second=", this.b, Separators.RPAREN);
    }
}
