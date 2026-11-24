package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f26008a;
    public final String b;

    public oxe0(File file, String str) {
        file.getClass();
        str.getClass();
        this.f26008a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxe0)) {
            return false;
        }
        oxe0 oxe0Var = (oxe0) obj;
        return Intrinsics.d(this.f26008a, oxe0Var.f26008a) && Intrinsics.d(this.b, oxe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26008a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPdfFile(file=" + this.f26008a + ", applicationId=" + this.b + Separators.RPAREN;
    }
}
