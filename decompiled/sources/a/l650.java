package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l650 implements o650 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19489a;

    public l650(String str) {
        str.getClass();
        this.f19489a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l650) && Intrinsics.d(this.f19489a, ((l650) obj).f19489a);
    }

    public final int hashCode() {
        return this.f19489a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnackBar(description=", this.f19489a, Separators.RPAREN);
    }
}
