package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class opd implements ynd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25635a;
    public final j83 b;

    public opd(String str, j83 j83Var) {
        str.getClass();
        this.f25635a = str;
        this.b = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opd)) {
            return false;
        }
        opd opdVar = (opd) obj;
        return Intrinsics.d(this.f25635a, opdVar.f25635a) && this.b.equals(opdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25635a.hashCode() * 31);
    }

    public final String toString() {
        return "CompressedCardSingleTeamUiModel(teamName=" + this.f25635a + ", topInfo=" + ((Object) this.b) + Separators.RPAREN;
    }
}
