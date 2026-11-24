package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p1y implements r1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26227a;
    public final boolean b;

    public p1y(String str, boolean z) {
        str.getClass();
        this.f26227a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1y)) {
            return false;
        }
        p1y p1yVar = (p1y) obj;
        return Intrinsics.d(this.f26227a, p1yVar.f26227a) && this.b == p1yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f26227a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ShowSnackBarMessage(message=", this.f26227a, ", closeDialog=", this.b, Separators.RPAREN);
    }
}
