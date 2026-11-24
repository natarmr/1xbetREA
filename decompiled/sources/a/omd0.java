package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class omd0 implements qmd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25498a;

    public omd0(String str) {
        str.getClass();
        this.f25498a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omd0) && Intrinsics.d(this.f25498a, ((omd0) obj).f25498a);
    }

    public final int hashCode() {
        return this.f25498a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowQuickBetTryAgainError(message=", this.f25498a, Separators.RPAREN);
    }
}
