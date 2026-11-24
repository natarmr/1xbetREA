package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xy80 implements zy80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41695a;

    public xy80(String str) {
        str.getClass();
        this.f41695a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy80) && Intrinsics.d(this.f41695a, ((xy80) obj).f41695a);
    }

    public final int hashCode() {
        return this.f41695a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbarMessage(message=", this.f41695a, Separators.RPAREN);
    }
}
