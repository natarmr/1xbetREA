package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f10822a;
    public final o2m b;

    public g7m(i4 i4Var, o2m o2mVar) {
        i4Var.getClass();
        this.f10822a = i4Var;
        this.b = o2mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7m)) {
            return false;
        }
        g7m g7mVar = (g7m) obj;
        return Intrinsics.d(this.f10822a, g7mVar.f10822a) && this.b.equals(g7mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10822a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberGameTableHeaderUiModel(mainBadges=" + this.f10822a + ", additionalBadge=" + this.b + Separators.RPAREN;
    }
}
