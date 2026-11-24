package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38944a;
    public final String b;

    public wcv0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f38944a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcv0)) {
            return false;
        }
        wcv0 wcv0Var = (wcv0) obj;
        return Intrinsics.d(this.f38944a, wcv0Var.f38944a) && Intrinsics.d(this.b, wcv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38944a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("WicketScoreModel(opponent1=", this.f38944a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
