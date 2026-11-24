package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5y implements w5y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35116a;
    public final boolean b;

    public u5y(String str, boolean z) {
        str.getClass();
        this.f35116a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5y)) {
            return false;
        }
        u5y u5yVar = (u5y) obj;
        return Intrinsics.d(this.f35116a, u5yVar.f35116a) && this.b == u5yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35116a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ShowSnackBarMessage(message=", this.f35116a, ", closeDialog=", this.b, Separators.RPAREN);
    }
}
