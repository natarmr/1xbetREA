package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vwc0 implements wwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38145a;

    public vwc0(File file) {
        file.getClass();
        this.f38145a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwc0) && Intrinsics.d(this.f38145a, ((vwc0) obj).f38145a);
    }

    public final int hashCode() {
        return this.f38145a.hashCode();
    }

    public final String toString() {
        return "OpenPdf(file=" + this.f38145a + Separators.RPAREN;
    }
}
