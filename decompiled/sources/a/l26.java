package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class l26 {
    public static final k26 Companion = new k26();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19293a;
    public final String b;

    public /* synthetic */ l26(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f19293a = null;
        } else {
            this.f19293a = l;
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
        if (!(obj instanceof l26)) {
            return false;
        }
        l26 l26Var = (l26) obj;
        return Intrinsics.d(this.f19293a, l26Var.f19293a) && Intrinsics.d(this.b, l26Var.b);
    }

    public final int hashCode() {
        Long l = this.f19293a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f19293a, "BaseSportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
