package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class avr implements dvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1540a;
    public final boolean b;
    public final long c;

    public avr(String str, long j, boolean z) {
        str.getClass();
        this.f1540a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avr)) {
            return false;
        }
        avr avrVar = (avr) obj;
        return Intrinsics.d(this.f1540a, avrVar.f1540a) && this.b == avrVar.b && this.c == avrVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(this.f1540a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, brm0.u("Subtitle(subtitle=", this.f1540a, ", showTimer=", this.b, ", timeStart="));
    }
}
