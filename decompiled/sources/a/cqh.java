package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4793a;
    public final String b;

    public cqh(String str, String str2) {
        str2.getClass();
        this.f4793a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqh)) {
            return false;
        }
        cqh cqhVar = (cqh) obj;
        return this.f4793a.equals(cqhVar.f4793a) && Intrinsics.d(this.b, cqhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4793a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CyberUFCStatisticsTextIndicatorUiModel(value=", this.f4793a, ", title=", this.b, Separators.RPAREN);
    }
}
