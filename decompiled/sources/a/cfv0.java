package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cfv0 implements dfv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4282a;

    public cfv0(String str) {
        this.f4282a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfv0) && Intrinsics.d(this.f4282a, ((cfv0) obj).f4282a);
    }

    public final int hashCode() {
        String str = this.f4282a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRecommendedGameClick(loadedImageUrl=", this.f4282a, Separators.RPAREN);
    }
}
