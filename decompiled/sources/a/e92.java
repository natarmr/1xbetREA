package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7400a;

    public e92(String str) {
        str.getClass();
        this.f7400a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e92) && Intrinsics.d(this.f7400a, ((e92) obj).f7400a);
    }

    public final int hashCode() {
        return this.f7400a.hashCode();
    }

    public final String toString() {
        return kng0.l("AltDesignLSpecialEventMainToolbar(title=", this.f7400a, Separators.RPAREN);
    }
}
