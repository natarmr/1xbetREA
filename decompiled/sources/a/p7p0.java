package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p7p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26518a;
    public final o9p0 b;

    public p7p0(boolean z, o9p0 o9p0Var) {
        this.f26518a = z;
        this.b = o9p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7p0)) {
            return false;
        }
        p7p0 p7p0Var = (p7p0) obj;
        return this.f26518a == p7p0Var.f26518a && Intrinsics.d(this.b, p7p0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f26518a) * 31;
        o9p0 o9p0Var = this.b;
        return iHashCode + (o9p0Var == null ? 0 : o9p0Var.hashCode());
    }

    public final String toString() {
        return "TeamDetailsAchievementState(connected=" + this.f26518a + ", teamDetails=" + this.b + Separators.RPAREN;
    }
}
