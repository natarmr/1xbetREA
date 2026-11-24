package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dd8 implements gd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5883a;

    public dd8(String str) {
        str.getClass();
        this.f5883a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd8) && Intrinsics.d(this.f5883a, ((dd8) obj).f5883a);
    }

    public final int hashCode() {
        return this.f5883a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSelectedBonusDialog(message=", this.f5883a, Separators.RPAREN);
    }
}
