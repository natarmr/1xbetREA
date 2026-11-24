package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n85 f1853a;
    public final boolean b;

    public b2j(n85 n85Var, boolean z) {
        this.f1853a = n85Var;
        this.b = z;
    }

    public static b2j a(b2j b2jVar, n85 n85Var, boolean z, int i) {
        if ((i & 1) != 0) {
            n85Var = b2jVar.f1853a;
        }
        if ((i & 2) != 0) {
            z = b2jVar.b;
        }
        b2jVar.getClass();
        return new b2j(n85Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2j)) {
            return false;
        }
        b2j b2jVar = (b2j) obj;
        return Intrinsics.d(this.f1853a, b2jVar.f1853a) && this.b == b2jVar.b;
    }

    public final int hashCode() {
        n85 n85Var = this.f1853a;
        return Boolean.hashCode(this.b) + ((n85Var == null ? 0 : n85Var.hashCode()) * 31);
    }

    public final String toString() {
        return "DailyTaskOnboardingState(availableTask=" + this.f1853a + ", isFirstPages=" + this.b + Separators.RPAREN;
    }
}
