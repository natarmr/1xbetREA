package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33450a;
    public final z75 b;

    public t75(String str, z75 z75Var) {
        str.getClass();
        z75Var.getClass();
        this.f33450a = str;
        this.b = z75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t75)) {
            return false;
        }
        t75 t75Var = (t75) obj;
        return Intrinsics.d(this.f33450a, t75Var.f33450a) && Intrinsics.d(this.b, t75Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33450a.hashCode() * 31);
    }

    public final String toString() {
        return "AvailableGamesUIState(title=" + this.f33450a + ", availableGamesUIModel=" + this.b + Separators.RPAREN;
    }
}
