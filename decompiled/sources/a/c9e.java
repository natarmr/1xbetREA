package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c9e implements f9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3957a;

    public c9e(File file) {
        file.getClass();
        this.f3957a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9e) && Intrinsics.d(this.f3957a, ((c9e) obj).f3957a);
    }

    public final int hashCode() {
        return this.f3957a.hashCode();
    }

    public final String toString() {
        return "Document(file=" + this.f3957a + Separators.RPAREN;
    }
}
