package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvn f8720a;
    public final List b;

    public f0j0(jvn jvnVar, List list) {
        list.getClass();
        this.f8720a = jvnVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0j0)) {
            return false;
        }
        f0j0 f0j0Var = (f0j0) obj;
        return this.f8720a == f0j0Var.f8720a && Intrinsics.d(this.b, f0j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8720a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsCoefTypeState(currentCoefType=" + this.f8720a + ", possibleCoefTypes=" + this.b + Separators.RPAREN;
    }
}
