package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nwl f29489a;

    public final boolean equals(Object obj) {
        if (obj instanceof qxl) {
            return Intrinsics.d(this.f29489a, ((qxl) obj).f29489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29489a.hashCode();
    }

    public final String toString() {
        return "LeftIcon(value=" + this.f29489a + Separators.RPAREN;
    }
}
