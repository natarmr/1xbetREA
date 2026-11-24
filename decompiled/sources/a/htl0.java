package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class htl0 {
    public static final gtl0 Companion = new gtl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13640a;
    public final String b;

    public /* synthetic */ htl0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f13640a = null;
        } else {
            this.f13640a = l;
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
        if (!(obj instanceof htl0)) {
            return false;
        }
        htl0 htl0Var = (htl0) obj;
        return Intrinsics.d(this.f13640a, htl0Var.f13640a) && Intrinsics.d(this.b, htl0Var.b);
    }

    public final int hashCode() {
        Long l = this.f13640a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f13640a, "Sport(id=", ", name=", this.b, Separators.RPAREN);
    }
}
