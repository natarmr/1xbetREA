package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q75 implements r75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28233a;

    public q75(String str) {
        str.getClass();
        this.f28233a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q75) && Intrinsics.d(this.f28233a, ((q75) obj).f28233a);
    }

    public final int hashCode() {
        return this.f28233a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoritesErrorSnackMessage(message=", this.f28233a, Separators.RPAREN);
    }
}
