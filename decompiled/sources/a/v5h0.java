package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36826a;
    public final String b;

    public v5h0(String str, String str2) {
        str.getClass();
        this.f36826a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5h0)) {
            return false;
        }
        v5h0 v5h0Var = (v5h0) obj;
        return Intrinsics.d(this.f36826a, v5h0Var.f36826a) && this.b.equals(v5h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36826a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ScoresModel(fullScore=", this.f36826a, ", currentPeriodName=", this.b, Separators.RPAREN);
    }
}
