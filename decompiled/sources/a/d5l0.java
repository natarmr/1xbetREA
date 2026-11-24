package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5512a;

    public d5l0(String str) {
        str.getClass();
        this.f5512a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5l0) && Intrinsics.d(this.f5512a, ((d5l0) obj).f5512a);
    }

    public final int hashCode() {
        return this.f5512a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWarning(warning=", this.f5512a, Separators.RPAREN);
    }
}
