package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class b5e implements f5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f2000a;

    public b5e(File file) {
        this.f2000a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5e) && this.f2000a.equals(((b5e) obj).f2000a);
    }

    public final int hashCode() {
        return this.f2000a.hashCode();
    }

    public final String toString() {
        return "ImageFile(file=" + this.f2000a + Separators.RPAREN;
    }
}
