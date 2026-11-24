package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6515a;
    public final String b;

    public dqh(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6515a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqh)) {
            return false;
        }
        dqh dqhVar = (dqh) obj;
        return Intrinsics.d(this.f6515a, dqhVar.f6515a) && Intrinsics.d(this.b, dqhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6515a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CyberUFCStatisticsTitleValueUiModel(title=", this.f6515a, ", value=", this.b, Separators.RPAREN);
    }
}
