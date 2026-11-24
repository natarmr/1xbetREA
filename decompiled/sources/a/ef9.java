package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ef9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7710a;

    public ef9(String str) {
        str.getClass();
        this.f7710a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef9) && Intrinsics.d(this.f7710a, ((ef9) obj).f7710a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f7710a;
    }

    public final int hashCode() {
        return this.f7710a.hashCode();
    }

    public final String toString() {
        return kng0.l("VerificationOptionsUiModel(title=", this.f7710a, Separators.RPAREN);
    }
}
