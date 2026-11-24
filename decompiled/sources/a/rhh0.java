package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rhh0 implements vhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30490a;
    public final String b;
    public final boolean c;

    public rhh0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f30490a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhh0)) {
            return false;
        }
        rhh0 rhh0Var = (rhh0) obj;
        return Intrinsics.d(this.f30490a, rhh0Var.f30490a) && Intrinsics.d(this.b, rhh0Var.b) && this.c == rhh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f30490a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ShowDefaultSearch(searchText=", this.f30490a, ", searchHint=", this.b, ", showKeyboardOnStart="), this.c, Separators.RPAREN);
    }
}
