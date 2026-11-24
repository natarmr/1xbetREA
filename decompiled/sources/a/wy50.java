package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnp0 f39961a;

    public wy50(tnp0 tnp0Var) {
        tnp0Var.getClass();
        this.f39961a = tnp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy50) && Intrinsics.d(this.f39961a, ((wy50) obj).f39961a);
    }

    public final int hashCode() {
        return this.f39961a.hashCode();
    }

    public final String toString() {
        return "OnRemoveFavoriteTeamClick(teamType=" + this.f39961a + Separators.RPAREN;
    }
}
