package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y840 implements z840 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42178a;

    public y840(String str) {
        str.getClass();
        this.f42178a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y840) && Intrinsics.d(this.f42178a, ((y840) obj).f42178a);
    }

    public final int hashCode() {
        return this.f42178a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(errorMessage=", this.f42178a, Separators.RPAREN);
    }
}
