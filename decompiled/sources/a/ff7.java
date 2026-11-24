package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ff7 implements gf7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9437a;

    public ff7(String str) {
        str.getClass();
        this.f9437a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff7) && Intrinsics.d(this.f9437a, ((ff7) obj).f9437a);
    }

    public final int hashCode() {
        return this.f9437a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f9437a, Separators.RPAREN);
    }
}
