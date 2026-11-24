package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g8d0 implements i8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10859a;

    public g8d0(String str) {
        str.getClass();
        this.f10859a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8d0) && Intrinsics.d(this.f10859a, ((g8d0) obj).f10859a);
    }

    public final int hashCode() {
        return this.f10859a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(message=", this.f10859a, Separators.RPAREN);
    }
}
