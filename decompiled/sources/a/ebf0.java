package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ebf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7516a;

    public ebf0(String str) {
        str.getClass();
        this.f7516a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebf0) && Intrinsics.d(this.f7516a, ((ebf0) obj).f7516a);
    }

    public final int hashCode() {
        return this.f7516a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDataFillingError(message=", this.f7516a, Separators.RPAREN);
    }
}
