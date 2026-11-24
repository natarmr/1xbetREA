package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25098a;
    public final String b;

    public oe(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f25098a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return Intrinsics.d(this.f25098a, oeVar.f25098a) && Intrinsics.d(this.b, oeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25098a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Data(amount=", this.f25098a, ", currency=", this.b, Separators.RPAREN);
    }
}
