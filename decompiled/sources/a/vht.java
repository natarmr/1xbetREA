package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vht implements yht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37447a;

    public vht(String str) {
        str.getClass();
        this.f37447a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vht) && Intrinsics.d(this.f37447a, ((vht) obj).f37447a);
    }

    public final int hashCode() {
        return this.f37447a.hashCode();
    }

    public final String toString() {
        return kng0.l("ErrorMessage(errorMessage=", this.f37447a, Separators.RPAREN);
    }
}
