package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tuf0 implements uuf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f34548a;

    public tuf0(File file) {
        file.getClass();
        this.f34548a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuf0) && Intrinsics.d(this.f34548a, ((tuf0) obj).f34548a);
    }

    public final int hashCode() {
        return this.f34548a.hashCode();
    }

    public final String toString() {
        return "OpenFile(file=" + this.f34548a + Separators.RPAREN;
    }
}
