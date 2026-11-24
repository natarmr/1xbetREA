package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k1c0 implements o1c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17516a;

    public k1c0(String str) {
        str.getClass();
        this.f17516a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1c0) && Intrinsics.d(this.f17516a, ((k1c0) obj).f17516a);
    }

    public final int hashCode() {
        return this.f17516a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f17516a, Separators.RPAREN);
    }
}
