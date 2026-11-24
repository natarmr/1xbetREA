package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ijm implements jjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qjm f14881a;

    public /* synthetic */ ijm() {
        this(new qjm());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijm) && Intrinsics.d(this.f14881a, ((ijm) obj).f14881a);
    }

    public final int hashCode() {
        return this.f14881a.f28846a.hashCode();
    }

    public final String toString() {
        return "Shimmer(headerStyle=" + this.f14881a + Separators.RPAREN;
    }

    public ijm(qjm qjmVar) {
        this.f14881a = qjmVar;
    }
}
