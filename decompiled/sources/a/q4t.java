package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q4t implements w4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28117a;
    public final String b;

    public q4t(long j, String str) {
        str.getClass();
        this.f28117a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4t)) {
            return false;
        }
        q4t q4tVar = (q4t) obj;
        return this.f28117a == q4tVar.f28117a && Intrinsics.d(this.b, q4tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f28117a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28117a, "FolderGame(id=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
