package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nsw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24070a;
    public final String b;
    public final a4x c;

    public nsw(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f24070a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsw)) {
            return false;
        }
        nsw nswVar = (nsw) obj;
        return Intrinsics.d(this.f24070a, nswVar.f24070a) && Intrinsics.d(this.b, nswVar.b) && Intrinsics.d(this.c, nswVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f24070a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("HostsVsGuestsStatisticUiModel(hostsName=", this.f24070a, ", guestsName=", this.b, ", hostsVsGuestsInfo="), this.c, Separators.RPAREN);
    }
}
