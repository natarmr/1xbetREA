package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jwc0 implements lwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17243a;

    public jwc0(File file) {
        file.getClass();
        this.f17243a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwc0) && Intrinsics.d(this.f17243a, ((jwc0) obj).f17243a);
    }

    public final int hashCode() {
        return this.f17243a.hashCode();
    }

    public final String toString() {
        return "OnOpenInformation(filesDir=" + this.f17243a + Separators.RPAREN;
    }
}
