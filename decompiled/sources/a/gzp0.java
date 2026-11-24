package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gzp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12191a;
    public final String b;

    public gzp0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f12191a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzp0)) {
            return false;
        }
        gzp0 gzp0Var = (gzp0) obj;
        return Intrinsics.d(this.f12191a, gzp0Var.f12191a) && Intrinsics.d(this.b, gzp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12191a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TennisSummaryUiModel(name=", this.f12191a, ", value=", this.b, Separators.RPAREN);
    }
}
