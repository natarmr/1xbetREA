package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h6e implements p6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f12525a;
    public final String b;

    public h6e(File file, String str) {
        file.getClass();
        str.getClass();
        this.f12525a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e)) {
            return false;
        }
        h6e h6eVar = (h6e) obj;
        return Intrinsics.d(this.f12525a, h6eVar.f12525a) && Intrinsics.d(this.b, h6eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12525a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(file=" + this.f12525a + ", mimeType=" + this.b + Separators.RPAREN;
    }
}
