package a;

import android.gov.nist.core.Separators;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f42768a;
    public final long b;

    public yk3(InputStream inputStream, long j) {
        inputStream.getClass();
        this.f42768a = inputStream;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk3)) {
            return false;
        }
        yk3 yk3Var = (yk3) obj;
        return Intrinsics.d(this.f42768a, yk3Var.f42768a) && this.b == yk3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f42768a.hashCode() * 31);
    }

    public final String toString() {
        return "AppUpdateDownloadApkModel(inputStream=" + this.f42768a + ", contentLength=" + this.b + Separators.RPAREN;
    }
}
