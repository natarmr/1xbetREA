package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class te7 implements ve7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33804a;

    public te7(String str) {
        str.getClass();
        this.f33804a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te7) && Intrinsics.d(this.f33804a, ((te7) obj).f33804a);
    }

    public final int hashCode() {
        return this.f33804a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnLimitIeValueChange(newValue=", this.f33804a, Separators.RPAREN);
    }
}
