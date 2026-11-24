package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swl f31270a;

    public final boolean equals(Object obj) {
        if (obj instanceof rxl) {
            return Intrinsics.d(this.f31270a, ((rxl) obj).f31270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31270a.hashCode();
    }

    public final String toString() {
        return "RightIcon(value=" + this.f31270a + Separators.RPAREN;
    }
}
