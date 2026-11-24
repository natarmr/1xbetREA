package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class z1c implements a2c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f43610a;

    public z1c(File file) {
        this.f43610a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1c) && this.f43610a.equals(((z1c) obj).f43610a);
    }

    public final int hashCode() {
        return this.f43610a.hashCode();
    }

    public final String toString() {
        return "UnsupportedFileModel(file=" + this.f43610a + Separators.RPAREN;
    }
}
