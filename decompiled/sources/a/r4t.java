package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29854a;
    public final String b;

    public r4t(long j, String str) {
        str.getClass();
        this.f29854a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4t)) {
            return false;
        }
        r4t r4tVar = (r4t) obj;
        return this.f29854a == r4tVar.f29854a && Intrinsics.d(this.b, r4tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f29854a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29854a, "FolderGame(id=", ", title=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
