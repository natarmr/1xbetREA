package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mlj0 implements olj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f21993a;

    public mlj0(Bitmap bitmap) {
        bitmap.getClass();
        this.f21993a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlj0) && Intrinsics.d(this.f21993a, ((mlj0) obj).f21993a);
    }

    public final int hashCode() {
        return this.f21993a.hashCode();
    }

    public final String toString() {
        return "OnShareButtonClicked(bitmap=" + this.f21993a + Separators.RPAREN;
    }
}
