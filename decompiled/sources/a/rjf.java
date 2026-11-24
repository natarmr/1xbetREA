package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class rjf {
    public static final qjf Companion = new qjf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30590a;
    public final String b;

    public /* synthetic */ rjf(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f30590a = null;
        } else {
            this.f30590a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjf)) {
            return false;
        }
        rjf rjfVar = (rjf) obj;
        return Intrinsics.d(this.f30590a, rjfVar.f30590a) && Intrinsics.d(this.b, rjfVar.b);
    }

    public final int hashCode() {
        String str = this.f30590a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Cs2CompositionSubTeamsResponse(teamTitle=", this.f30590a, ", teamImage=", this.b, Separators.RPAREN);
    }
}
