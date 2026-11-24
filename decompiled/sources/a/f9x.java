package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f9x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9177a;
    public final boolean b;

    public f9x(String str, boolean z) {
        str.getClass();
        this.f9177a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9x)) {
            return false;
        }
        f9x f9xVar = (f9x) obj;
        return Intrinsics.d(this.f9177a, f9xVar.f9177a) && this.b == f9xVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9177a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InfoLineUiState(infoText=", this.f9177a, ", isVisible=", this.b, Separators.RPAREN);
    }
}
