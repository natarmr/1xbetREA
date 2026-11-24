package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kfe0 implements mfe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18192a;

    public kfe0(String str) {
        str.getClass();
        this.f18192a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfe0) && Intrinsics.d(this.f18192a, ((kfe0) obj).f18192a);
    }

    public final int hashCode() {
        return this.f18192a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f18192a, Separators.RPAREN);
    }
}
