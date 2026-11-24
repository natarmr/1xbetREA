package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iya implements jya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15579a;

    public iya(String str) {
        str.getClass();
        this.f15579a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iya) && Intrinsics.d(this.f15579a, ((iya) obj).f15579a);
    }

    public final int hashCode() {
        return this.f15579a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(title=", this.f15579a, Separators.RPAREN);
    }
}
