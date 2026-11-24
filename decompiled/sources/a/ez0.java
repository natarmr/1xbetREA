package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ez0 implements gz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8648a;

    public ez0(String str) {
        str.getClass();
        this.f8648a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez0) && Intrinsics.d(this.f8648a, ((ez0) obj).f8648a);
    }

    public final int hashCode() {
        return this.f8648a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoriteErrorSnack(message=", this.f8648a, Separators.RPAREN);
    }
}
