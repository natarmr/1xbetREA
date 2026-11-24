package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fd8 implements gd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9345a;

    public fd8(String str) {
        str.getClass();
        this.f9345a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd8) && Intrinsics.d(this.f9345a, ((fd8) obj).f9345a);
    }

    public final int hashCode() {
        return this.f9345a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSelectedBonusResultSnackbar(message=", this.f9345a, Separators.RPAREN);
    }
}
