package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class t3n0 {
    public static final n3n0 Companion = new n3n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33277a;
    public final String b;

    public /* synthetic */ t3n0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f33277a = null;
        } else {
            this.f33277a = l;
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
        if (!(obj instanceof t3n0)) {
            return false;
        }
        t3n0 t3n0Var = (t3n0) obj;
        return Intrinsics.d(this.f33277a, t3n0Var.f33277a) && Intrinsics.d(this.b, t3n0Var.b);
    }

    public final int hashCode() {
        Long l = this.f33277a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f33277a, "SubSportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
