package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dhz implements hhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6115a;

    public dhz(String str) {
        str.getClass();
        this.f6115a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhz) && Intrinsics.d(this.f6115a, ((dhz) obj).f6115a);
    }

    public final int hashCode() {
        return this.f6115a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBardDialog(message=", this.f6115a, Separators.RPAREN);
    }
}
