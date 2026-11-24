package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27069a;
    public final String b;

    public pj3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27069a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj3)) {
            return false;
        }
        pj3 pj3Var = (pj3) obj;
        return Intrinsics.d(this.f27069a, pj3Var.f27069a) && Intrinsics.d(this.b, pj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27069a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AppStringKV(key=", this.f27069a, ", value=", this.b, Separators.RPAREN);
    }
}
