package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tt6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ut6 f34495a;
    public final String b;

    public tt6(ut6 ut6Var, String str) {
        ut6Var.getClass();
        this.f34495a = ut6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt6)) {
            return false;
        }
        tt6 tt6Var = (tt6) obj;
        return Intrinsics.d(this.f34495a, tt6Var.f34495a) && this.b.equals(tt6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34495a.hashCode() * 31);
    }

    public final String toString() {
        return "BetConstructorTipModel(screen=" + this.f34495a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
