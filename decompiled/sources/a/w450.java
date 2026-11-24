package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w450 implements z450 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38529a;

    public w450(String str) {
        str.getClass();
        this.f38529a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w450) && Intrinsics.d(this.f38529a, ((w450) obj).f38529a);
    }

    public final int hashCode() {
        return this.f38529a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoriteError(description=", this.f38529a, Separators.RPAREN);
    }
}
