package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q9l implements s9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28353a;
    public final String b;

    public q9l(String str, String str2) {
        str.getClass();
        this.f28353a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9l)) {
            return false;
        }
        q9l q9lVar = (q9l) obj;
        return Intrinsics.d(this.f28353a, q9lVar.f28353a) && this.b.equals(q9lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28353a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(teamName=", this.f28353a, ", teamImage=", this.b, Separators.RPAREN);
    }
}
