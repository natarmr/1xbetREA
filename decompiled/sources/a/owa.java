package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class owa implements qwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25960a;
    public final String b;
    public final boolean c;
    public final long d;

    public owa(long j, String str, String str2, boolean z) {
        this.f25960a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owa)) {
            return false;
        }
        owa owaVar = (owa) obj;
        return this.f25960a.equals(owaVar.f25960a) && Intrinsics.d(this.b, owaVar.b) && this.c == owaVar.c && this.d == owaVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f25960a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.d) + brm0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(amount=", this.f25960a, ", euroAmount=", this.b, ", withdrawAvailable=");
        rw2.v(this.d, ", timerEndMillis=", sbN, this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
