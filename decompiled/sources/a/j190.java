package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j190 implements k190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15723a;

    public j190(String str) {
        str.getClass();
        this.f15723a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j190) && Intrinsics.d(this.f15723a, ((j190) obj).f15723a);
    }

    public final int hashCode() {
        return this.f15723a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowExpiredTokenError(errorMessage=", this.f15723a, Separators.RPAREN);
    }
}
