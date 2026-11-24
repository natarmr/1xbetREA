package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dpw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6485a;
    public final String b;

    public dpw(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6485a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpw)) {
            return false;
        }
        dpw dpwVar = (dpw) obj;
        return Intrinsics.d(this.f6485a, dpwVar.f6485a) && Intrinsics.d(this.b, dpwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6485a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("HorseRunnerInfoItemUiModel(title=", this.f6485a, ", description=", this.b, Separators.RPAREN);
    }
}
