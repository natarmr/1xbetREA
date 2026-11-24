package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uu00 implements vu00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36280a;

    public uu00(String str) {
        str.getClass();
        this.f36280a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu00) && Intrinsics.d(this.f36280a, ((uu00) obj).f36280a);
    }

    public final int hashCode() {
        return this.f36280a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f36280a, Separators.RPAREN);
    }
}
