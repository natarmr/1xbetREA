package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15788a;
    public final String b;

    public j2n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f15788a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2n)) {
            return false;
        }
        j2n j2nVar = (j2n) obj;
        return Intrinsics.d(this.f15788a, j2nVar.f15788a) && Intrinsics.d(this.b, j2nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15788a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ScoreUiModel(scoreTitle=", this.f15788a, ", scoreValue=", this.b, Separators.RPAREN);
    }
}
