package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class in0 implements kn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15050a;

    public in0(String str) {
        str.getClass();
        this.f15050a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in0) && Intrinsics.d(this.f15050a, ((in0) obj).f15050a);
    }

    public final int hashCode() {
        return this.f15050a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f15050a, Separators.RPAREN);
    }
}
