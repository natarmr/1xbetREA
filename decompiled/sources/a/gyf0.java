package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gyf0 implements kyf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12126a;

    public gyf0(String str) {
        str.getClass();
        this.f12126a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyf0) && Intrinsics.d(this.f12126a, ((gyf0) obj).f12126a);
    }

    public final int hashCode() {
        return this.f12126a.hashCode();
    }

    public final String toString() {
        return kng0.l("RestorePhone(phoneNumber=", this.f12126a, Separators.RPAREN);
    }
}
