package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class osw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25802a;
    public final String b;
    public final a4x c;

    public osw(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f25802a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osw)) {
            return false;
        }
        osw oswVar = (osw) obj;
        return Intrinsics.d(this.f25802a, oswVar.f25802a) && Intrinsics.d(this.b, oswVar.b) && Intrinsics.d(this.c, oswVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f25802a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("HostsVsGuestsStatisticUiModel(hostsName=", this.f25802a, ", guestsName=", this.b, ", hostsVsGuestsInfo="), this.c, Separators.RPAREN);
    }
}
