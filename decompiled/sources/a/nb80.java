package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnp0 f23228a;

    public nb80(tnp0 tnp0Var) {
        tnp0Var.getClass();
        this.f23228a = tnp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb80) && Intrinsics.d(this.f23228a, ((nb80) obj).f23228a);
    }

    public final int hashCode() {
        return this.f23228a.hashCode();
    }

    public final String toString() {
        return "OnRemoveFavoriteTeamClick(teamType=" + this.f23228a + Separators.RPAREN;
    }
}
