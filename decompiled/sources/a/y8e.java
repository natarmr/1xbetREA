package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y8e implements b9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f42190a;

    public y8e(File file) {
        file.getClass();
        this.f42190a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8e) && Intrinsics.d(this.f42190a, ((y8e) obj).f42190a);
    }

    public final int hashCode() {
        return this.f42190a.hashCode();
    }

    public final String toString() {
        return "Document(file=" + this.f42190a + Separators.RPAREN;
    }
}
