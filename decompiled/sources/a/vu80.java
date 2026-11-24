package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vu80 implements xu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38036a;

    public vu80(String str) {
        str.getClass();
        this.f38036a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu80) && Intrinsics.d(this.f38036a, ((vu80) obj).f38036a);
    }

    public final int hashCode() {
        return this.f38036a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f38036a, Separators.RPAREN);
    }
}
