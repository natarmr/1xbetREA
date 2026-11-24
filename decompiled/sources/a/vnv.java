package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vnv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37736a;
    public final String b;

    public vnv(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f37736a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnv)) {
            return false;
        }
        vnv vnvVar = (vnv) obj;
        return Intrinsics.d(this.f37736a, vnvVar.f37736a) && Intrinsics.d(this.b, vnvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37736a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Score(firstTeamScore=", this.f37736a, ", secondTeamScore=", this.b, Separators.RPAREN);
    }
}
