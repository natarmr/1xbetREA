package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gm00 implements jm00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f11519a;

    public gm00(File file) {
        file.getClass();
        this.f11519a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm00) && Intrinsics.d(this.f11519a, ((gm00) obj).f11519a);
    }

    public final int hashCode() {
        return this.f11519a.hashCode();
    }

    public final String toString() {
        return "Content(file=" + this.f11519a + Separators.RPAREN;
    }
}
