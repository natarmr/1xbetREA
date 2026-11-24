package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gec0 implements jec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11148a;
    public final String b;

    public gec0(String str, String str2) {
        str.getClass();
        this.f11148a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gec0)) {
            return false;
        }
        gec0 gec0Var = (gec0) obj;
        return Intrinsics.d(this.f11148a, gec0Var.f11148a) && this.b.equals(gec0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11148a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorDialog(title=", this.f11148a, ", message=", this.b, Separators.RPAREN);
    }
}
