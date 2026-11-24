package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20506a;
    public final File b;

    public lr00(File file, String str) {
        str.getClass();
        this.f20506a = str;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr00)) {
            return false;
        }
        lr00 lr00Var = (lr00) obj;
        return Intrinsics.d(this.f20506a, lr00Var.f20506a) && this.b.equals(lr00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20506a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalFileModel(mediaId=" + this.f20506a + ", file=" + this.b + Separators.RPAREN;
    }
}
