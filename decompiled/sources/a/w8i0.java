package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w8i0 implements y8i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38724a;

    public w8i0(String str) {
        str.getClass();
        this.f38724a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8i0) && Intrinsics.d(this.f38724a, ((w8i0) obj).f38724a);
    }

    public final int hashCode() {
        return this.f38724a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f38724a, Separators.RPAREN);
    }
}
