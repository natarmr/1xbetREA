package a;

import android.gov.nist.core.Separators;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f11042a;
    public final long b;

    public gc5(InputStream inputStream, long j) {
        inputStream.getClass();
        this.f11042a = inputStream;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc5)) {
            return false;
        }
        gc5 gc5Var = (gc5) obj;
        return Intrinsics.d(this.f11042a, gc5Var.f11042a) && this.b == gc5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f11042a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundDownloadImageModel(inputStream=" + this.f11042a + ", contentLength=" + this.b + Separators.RPAREN;
    }
}
