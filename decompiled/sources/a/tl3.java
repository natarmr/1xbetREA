package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class tl3 implements wl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f34125a;
    public final String b;

    public tl3(File file, String str) {
        this.f34125a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl3)) {
            return false;
        }
        tl3 tl3Var = (tl3) obj;
        return this.f34125a.equals(tl3Var.f34125a) && this.b.equals(tl3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34125a.hashCode() * 31);
    }

    public final String toString() {
        return "InstallUpdate(apkFile=" + this.f34125a + ", applicationId=" + this.b + Separators.RPAREN;
    }
}
