package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class db50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5786a;
    public final Float b;

    public db50(boolean z, Float f) {
        this.f5786a = z;
        this.b = f;
    }

    public static db50 a(db50 db50Var, boolean z, Float f, int i) {
        if ((i & 1) != 0) {
            z = db50Var.f5786a;
        }
        if ((i & 2) != 0) {
            f = db50Var.b;
        }
        db50Var.getClass();
        return new db50(z, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db50)) {
            return false;
        }
        db50 db50Var = (db50) obj;
        return this.f5786a == db50Var.f5786a && Intrinsics.d(this.b, db50Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f5786a) * 31;
        Float f = this.b;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "NavBarState(isVisible=" + this.f5786a + ", snackBarAnchorY=" + this.b + Separators.RPAREN;
    }
}
