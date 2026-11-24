package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qar {
    public static final par Companion = new par();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iar f28410a;

    static {
        har harVar = iar.Companion;
    }

    public /* synthetic */ qar(int i, iar iarVar) {
        if ((i & 1) == 0) {
            this.f28410a = null;
        } else {
            this.f28410a = iarVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qar) && Intrinsics.d(this.f28410a, ((qar) obj).f28410a);
    }

    public final int hashCode() {
        iar iarVar = this.f28410a;
        if (iarVar == null) {
            return 0;
        }
        return iarVar.hashCode();
    }

    public final String toString() {
        return "FullDescriptionResponse(response=" + this.f28410a + Separators.RPAREN;
    }
}
