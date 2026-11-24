package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oen0 implements pen0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f25132a;

    public oen0(i4 i4Var) {
        i4Var.getClass();
        this.f25132a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oen0) && Intrinsics.d(this.f25132a, ((oen0) obj).f25132a);
    }

    public final int hashCode() {
        return this.f25132a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "ShowTeams(isRefreshing=false, items=" + this.f25132a + Separators.RPAREN;
    }
}
