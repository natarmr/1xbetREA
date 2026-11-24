package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y3n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41961a;
    public final String b;

    public y3n0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f41961a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3n0)) {
            return false;
        }
        y3n0 y3n0Var = (y3n0) obj;
        return Intrinsics.d(this.f41961a, y3n0Var.f41961a) && Intrinsics.d(this.b, y3n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41961a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SubTeamModel(title=", this.f41961a, ", image=", this.b, Separators.RPAREN);
    }
}
