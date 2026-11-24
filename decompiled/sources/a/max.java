package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class max implements pax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21479a;
    public final String b;

    public max(File file, String str) {
        file.getClass();
        str.getClass();
        this.f21479a = file;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof max)) {
            return false;
        }
        max maxVar = (max) obj;
        return Intrinsics.d(this.f21479a, maxVar.f21479a) && Intrinsics.d(this.b, maxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21479a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPdf(file=" + this.f21479a + ", appId=" + this.b + Separators.RPAREN;
    }
}
