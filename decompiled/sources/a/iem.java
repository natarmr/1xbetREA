package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14640a;
    public final String b;

    public iem(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f14640a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iem)) {
            return false;
        }
        iem iemVar = (iem) obj;
        return Intrinsics.d(this.f14640a, iemVar.f14640a) && Intrinsics.d(this.b, iemVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14640a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AdditionalInfoUiModel(header=", this.f14640a, ", description=", this.b, Separators.RPAREN);
    }
}
