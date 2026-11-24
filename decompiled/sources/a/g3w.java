package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10632a;
    public final String b;

    public g3w(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10632a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3w)) {
            return false;
        }
        g3w g3wVar = (g3w) obj;
        return Intrinsics.d(this.f10632a, g3wVar.f10632a) && Intrinsics.d(this.b, g3wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10632a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("HistoryItemCoefficientUiModel(titleText=", this.f10632a, ", descriptionText=", this.b, Separators.RPAREN);
    }
}
