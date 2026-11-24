package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r8m implements u8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30034a;

    public r8m(String str) {
        str.getClass();
        this.f30034a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8m) && Intrinsics.d(this.f30034a, ((r8m) obj).f30034a);
    }

    public final int hashCode() {
        return this.f30034a.hashCode();
    }

    public final String toString() {
        return kng0.l("Score(value=", this.f30034a, Separators.RPAREN);
    }
}
