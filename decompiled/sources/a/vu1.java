package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vu1 implements xu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38031a;

    public vu1(String str) {
        str.getClass();
        this.f38031a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu1) && Intrinsics.d(this.f38031a, ((vu1) obj).f38031a);
    }

    public final int hashCode() {
        return this.f38031a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f38031a, Separators.RPAREN);
    }
}
