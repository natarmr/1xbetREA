package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ib80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnp0 f14475a;
    public final String b;

    public ib80(tnp0 tnp0Var, String str) {
        tnp0Var.getClass();
        this.f14475a = tnp0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib80)) {
            return false;
        }
        ib80 ib80Var = (ib80) obj;
        return Intrinsics.d(this.f14475a, ib80Var.f14475a) && this.b.equals(ib80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14475a.hashCode() * 31);
    }

    public final String toString() {
        return "OnFavoriteTeamClick(teamType=" + this.f14475a + ", teamName=" + this.b + Separators.RPAREN;
    }
}
