package a;

import android.gov.nist.core.Separators;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f12803a;
    public final long b;

    public hc5(InputStream inputStream, long j) {
        inputStream.getClass();
        this.f12803a = inputStream;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc5)) {
            return false;
        }
        hc5 hc5Var = (hc5) obj;
        return Intrinsics.d(this.f12803a, hc5Var.f12803a) && this.b == hc5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f12803a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundDownloadVideoModel(inputStream=" + this.f12803a + ", contentLength=" + this.b + Separators.RPAREN;
    }
}
