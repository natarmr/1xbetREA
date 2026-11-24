package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ac7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f615a;

    public ac7(String str) {
        str.getClass();
        this.f615a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac7) && Intrinsics.d(this.f615a, ((ac7) obj).f615a);
    }

    public final int hashCode() {
        return this.f615a.hashCode();
    }

    public final String toString() {
        return kng0.l("HideCoupon(snackbarTitle=", this.f615a, Separators.RPAREN);
    }
}
