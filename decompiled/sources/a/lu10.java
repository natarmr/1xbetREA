package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lu10 {
    public static final ku10 Companion = new ku10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20652a;
    public final String b;

    public /* synthetic */ lu10(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f20652a = null;
        } else {
            this.f20652a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu10)) {
            return false;
        }
        lu10 lu10Var = (lu10) obj;
        return Intrinsics.d(this.f20652a, lu10Var.f20652a) && Intrinsics.d(this.b, lu10Var.b);
    }

    public final int hashCode() {
        Long l = this.f20652a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f20652a, "SportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
