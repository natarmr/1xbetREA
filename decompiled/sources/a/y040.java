package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y040 implements c140 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41788a;

    public y040(String str) {
        str.getClass();
        this.f41788a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y040) && Intrinsics.d(this.f41788a, ((y040) obj).f41788a);
    }

    public final int hashCode() {
        return this.f41788a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(errorMessage=", this.f41788a, Separators.RPAREN);
    }
}
