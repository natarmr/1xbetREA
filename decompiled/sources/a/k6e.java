package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k6e implements p6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17764a;

    public k6e(String str) {
        str.getClass();
        this.f17764a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6e) && Intrinsics.d(this.f17764a, ((k6e) obj).f17764a);
    }

    public final int hashCode() {
        return this.f17764a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowCountDownSnackbar(countDownNotPassed=", this.f17764a, Separators.RPAREN);
    }
}
