package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ty50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnp0 f34737a;
    public final String b;

    public ty50(tnp0 tnp0Var, String str) {
        tnp0Var.getClass();
        this.f34737a = tnp0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty50)) {
            return false;
        }
        ty50 ty50Var = (ty50) obj;
        return Intrinsics.d(this.f34737a, ty50Var.f34737a) && this.b.equals(ty50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34737a.hashCode() * 31);
    }

    public final String toString() {
        return "OnFavoriteTeamClick(teamType=" + this.f34737a + ", teamName=" + this.b + Separators.RPAREN;
    }
}
