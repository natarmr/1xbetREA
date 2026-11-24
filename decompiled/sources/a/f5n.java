package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8970a;
    public final String b;

    public f5n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f8970a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5n)) {
            return false;
        }
        f5n f5nVar = (f5n) obj;
        return Intrinsics.d(this.f8970a, f5nVar.f8970a) && Intrinsics.d(this.b, f5nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8970a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DsSubTeamModel(title=", this.f8970a, ", image=", this.b, Separators.RPAREN);
    }
}
