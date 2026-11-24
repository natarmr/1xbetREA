package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26006a;
    public final String b;

    public oxd(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f26006a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxd)) {
            return false;
        }
        oxd oxdVar = (oxd) obj;
        return Intrinsics.d(this.f26006a, oxdVar.f26006a) && Intrinsics.d(this.b, oxdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26006a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorWithExitDialog(title=", this.f26006a, ", message=", this.b, Separators.RPAREN);
    }
}
