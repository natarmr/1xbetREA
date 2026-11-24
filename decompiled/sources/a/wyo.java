package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wyo implements xyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39983a;

    public wyo(String str) {
        str.getClass();
        this.f39983a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyo) && Intrinsics.d(this.f39983a, ((wyo) obj).f39983a);
    }

    public final int hashCode() {
        return this.f39983a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWebCaptcha(captchaToken=", this.f39983a, Separators.RPAREN);
    }
}
