package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ho3 implements s1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13374a;

    public ho3(String str) {
        str.getClass();
        this.f13374a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho3) && Intrinsics.d(this.f13374a, ((ho3) obj).f13374a);
    }

    public final int hashCode() {
        return this.f13374a.hashCode();
    }

    public final String toString() {
        return kng0.l("AppVersionUiModel(version=", this.f13374a, Separators.RPAREN);
    }
}
