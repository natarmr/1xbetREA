package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yw40 implements zw40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43353a;
    public final String b;

    public yw40(String str, String str2) {
        str.getClass();
        this.f43353a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw40)) {
            return false;
        }
        yw40 yw40Var = (yw40) obj;
        return Intrinsics.d(this.f43353a, yw40Var.f43353a) && this.b.equals(yw40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43353a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TwoTeam(name=", this.f43353a, ", imageUrl=", this.b, Separators.RPAREN);
    }
}
