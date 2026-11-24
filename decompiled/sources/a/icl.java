package a;

import android.gov.nist.core.Separators;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class icl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f14541a;
    public final long b;

    public icl(InputStream inputStream, long j) {
        inputStream.getClass();
        this.f14541a = inputStream;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icl)) {
            return false;
        }
        icl iclVar = (icl) obj;
        return Intrinsics.d(this.f14541a, iclVar.f14541a) && this.b == iclVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f14541a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadFileModel(inputStream=" + this.f14541a + ", contentLength=" + this.b + Separators.RPAREN;
    }
}
