package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oxc0 implements pxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f26005a;

    public oxc0(File file) {
        file.getClass();
        this.f26005a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxc0) && Intrinsics.d(this.f26005a, ((oxc0) obj).f26005a);
    }

    public final int hashCode() {
        return this.f26005a.hashCode();
    }

    public final String toString() {
        return "OpenPdf(file=" + this.f26005a + Separators.RPAREN;
    }
}
