package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tvr implements uvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34615a;
    public final long b;
    public final boolean c;
    public final int d;

    public tvr(int i, long j, String str, boolean z) {
        str.getClass();
        this.f34615a = str;
        this.b = j;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvr)) {
            return false;
        }
        tvr tvrVar = (tvr) obj;
        return Intrinsics.d(this.f34615a, tvrVar.f34615a) && this.b == tvrVar.b && this.c == tvrVar.c && this.d == tvrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(rw2.b(this.f34615a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Subtitle(subTitle=", this.f34615a, ", startTime=");
        cs0.v(this.d, ", timerEnabled=", ", textMaxLines=", sbO, this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
