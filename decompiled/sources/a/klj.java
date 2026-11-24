package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class klj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18491a;
    public final boolean b;

    public klj(String str, boolean z) {
        str.getClass();
        this.f18491a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klj)) {
            return false;
        }
        klj kljVar = (klj) obj;
        return Intrinsics.d(this.f18491a, kljVar.f18491a) && this.b == kljVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18491a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("DecryptModel(data=", this.f18491a, ", success=", this.b, Separators.RPAREN);
    }
}
