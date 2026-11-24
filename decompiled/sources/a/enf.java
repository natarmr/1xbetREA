package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class enf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8091a;
    public final String b;

    public enf(String str, String str2) {
        str2.getClass();
        this.f8091a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enf)) {
            return false;
        }
        enf enfVar = (enf) obj;
        return this.f8091a.equals(enfVar.f8091a) && Intrinsics.d(this.b, enfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8091a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(teamImage=", this.f8091a, ", teamName=", this.b, Separators.RPAREN);
    }
}
