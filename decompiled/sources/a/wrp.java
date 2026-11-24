package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wrp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39655a;
    public final String b;
    public final String c;

    public wrp(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f39655a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrp)) {
            return false;
        }
        wrp wrpVar = (wrp) obj;
        return this.f39655a.equals(wrpVar.f39655a) && Intrinsics.d(this.b, wrpVar.b) && Intrinsics.d(this.c, wrpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39655a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("FifaMatchStatisticsTeamUiModel(logo=", this.f39655a, ", name=", this.b, ", score="), this.c, Separators.RPAREN);
    }
}
