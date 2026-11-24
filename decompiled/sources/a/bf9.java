package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bf9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2491a;

    public bf9(String str) {
        str.getClass();
        this.f2491a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf9) && Intrinsics.d(this.f2491a, ((bf9) obj).f2491a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f2491a;
    }

    public final int hashCode() {
        return this.f2491a.hashCode();
    }

    public final String toString() {
        return kng0.l("ForceUpdateForBirdUiModel(title=", this.f2491a, Separators.RPAREN);
    }
}
