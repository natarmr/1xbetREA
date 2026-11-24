package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wc4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38908a;

    public wc4(String str) {
        str.getClass();
        this.f38908a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc4) && Intrinsics.d(this.f38908a, ((wc4) obj).f38908a);
    }

    public final int hashCode() {
        return this.f38908a.hashCode();
    }

    public final String toString() {
        return kng0.l("ConfirmNewPlaceSuccess(verificationQuestionType=", this.f38908a, Separators.RPAREN);
    }
}
