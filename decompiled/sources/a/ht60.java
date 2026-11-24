package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ht60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13619a;

    public ht60(String str) {
        this.f13619a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht60) && Intrinsics.d(this.f13619a, ((ht60) obj).f13619a);
    }

    public final int hashCode() {
        String str = this.f13619a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCompanyGameClick(loadedImageUrl=", this.f13619a, Separators.RPAREN);
    }
}
