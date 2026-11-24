package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class df9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5988a;

    public df9(String str) {
        str.getClass();
        this.f5988a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df9) && Intrinsics.d(this.f5988a, ((df9) obj).f5988a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f5988a;
    }

    public final int hashCode() {
        return this.f5988a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateUiModel(title=", this.f5988a, Separators.RPAREN);
    }
}
