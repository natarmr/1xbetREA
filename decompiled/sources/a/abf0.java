package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class abf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f576a;
    public final String b;

    public abf0(File file, String str) {
        file.getClass();
        str.getClass();
        this.f576a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abf0)) {
            return false;
        }
        abf0 abf0Var = (abf0) obj;
        return Intrinsics.d(this.f576a, abf0Var.f576a) && Intrinsics.d(this.b, abf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f576a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPdfFile(file=" + this.f576a + ", applicationId=" + this.b + Separators.RPAREN;
    }
}
