package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class loa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20382a;
    public final String b;

    public loa(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20382a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loa)) {
            return false;
        }
        loa loaVar = (loa) obj;
        return Intrinsics.d(this.f20382a, loaVar.f20382a) && Intrinsics.d(this.b, loaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20382a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CardTimerSectionModel(teamOneName=", this.f20382a, ", teamTwoName=", this.b, Separators.RPAREN);
    }
}
