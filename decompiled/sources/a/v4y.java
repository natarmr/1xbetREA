package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v4y implements x4y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36805a;
    public final boolean b;

    public v4y(String str, boolean z) {
        str.getClass();
        this.f36805a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4y)) {
            return false;
        }
        v4y v4yVar = (v4y) obj;
        return Intrinsics.d(this.f36805a, v4yVar.f36805a) && this.b == v4yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f36805a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("ShowSnackBarMessage(message=", this.f36805a, ", closeDialog=", this.b, Separators.RPAREN);
    }
}
