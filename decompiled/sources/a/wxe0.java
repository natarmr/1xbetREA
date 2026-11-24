package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39929a;

    public wxe0(String str) {
        str.getClass();
        this.f39929a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxe0) && Intrinsics.d(this.f39929a, ((wxe0) obj).f39929a);
    }

    public final int hashCode() {
        return this.f39929a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f39929a, Separators.RPAREN);
    }
}
