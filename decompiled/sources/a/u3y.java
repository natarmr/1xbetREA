package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u3y implements w3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35018a;
    public final boolean b;

    public u3y(String str, boolean z) {
        str.getClass();
        this.f35018a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3y)) {
            return false;
        }
        u3y u3yVar = (u3y) obj;
        return Intrinsics.d(this.f35018a, u3yVar.f35018a) && this.b == u3yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35018a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ShowSnackBarMessage(message=", this.f35018a, ", closeDialog=", this.b, Separators.RPAREN);
    }
}
