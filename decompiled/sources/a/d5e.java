package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class d5e implements f5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f5501a;

    public d5e(File file) {
        this.f5501a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5e) && this.f5501a.equals(((d5e) obj).f5501a);
    }

    public final int hashCode() {
        return this.f5501a.hashCode();
    }

    public final String toString() {
        return "NotImageFile(file=" + this.f5501a + Separators.RPAREN;
    }
}
