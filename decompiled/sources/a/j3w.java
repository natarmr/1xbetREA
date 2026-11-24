package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15854a;
    public final String b;

    public j3w(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f15854a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3w)) {
            return false;
        }
        j3w j3wVar = (j3w) obj;
        return Intrinsics.d(this.f15854a, j3wVar.f15854a) && Intrinsics.d(this.b, j3wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15854a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("HistoryItemExpressCoefficientUiModel(titleText=", this.f15854a, ", descriptionText=", this.b, Separators.RPAREN);
    }
}
