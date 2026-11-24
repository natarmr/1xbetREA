package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vvc0 implements xvc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38092a;

    public vvc0(File file) {
        file.getClass();
        this.f38092a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvc0) && Intrinsics.d(this.f38092a, ((vvc0) obj).f38092a);
    }

    public final int hashCode() {
        return this.f38092a.hashCode();
    }

    public final String toString() {
        return "OnOpenInformation(filesDir=" + this.f38092a + Separators.RPAREN;
    }
}
