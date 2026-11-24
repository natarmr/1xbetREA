package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jmf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16761a;
    public final String b;

    public jmf(String str, String str2) {
        str2.getClass();
        this.f16761a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmf)) {
            return false;
        }
        jmf jmfVar = (jmf) obj;
        return this.f16761a.equals(jmfVar.f16761a) && Intrinsics.d(this.b, jmfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16761a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(teamImage=", this.f16761a, ", teamName=", this.b, Separators.RPAREN);
    }
}
