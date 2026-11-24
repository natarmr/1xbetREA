package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3890a;

    public c81(String str) {
        str.getClass();
        this.f3890a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c81) && Intrinsics.d(this.f3890a, ((c81) obj).f3890a);
    }

    public final int hashCode() {
        return this.f3890a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoriteErrorSnack(message=", this.f3890a, Separators.RPAREN);
    }
}
