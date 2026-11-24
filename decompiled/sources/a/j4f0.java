package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f15882a;
    public final String b;

    public j4f0(File file, String str) {
        file.getClass();
        str.getClass();
        this.f15882a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4f0)) {
            return false;
        }
        j4f0 j4f0Var = (j4f0) obj;
        return Intrinsics.d(this.f15882a, j4f0Var.f15882a) && Intrinsics.d(this.b, j4f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15882a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPdfFile(file=" + this.f15882a + ", applicationId=" + this.b + Separators.RPAREN;
    }
}
