package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31594a;
    public final String b;

    public s480(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f31594a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s480)) {
            return false;
        }
        s480 s480Var = (s480) obj;
        return Intrinsics.d(this.f31594a, s480Var.f31594a) && Intrinsics.d(this.b, s480Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31594a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OpponentsScore(firstOpponentScore=", this.f31594a, ", secondOpponentScore=", this.b, Separators.RPAREN);
    }
}
