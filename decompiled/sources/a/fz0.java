package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fz0 implements gz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10384a;

    public fz0(String str) {
        str.getClass();
        this.f10384a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz0) && Intrinsics.d(this.f10384a, ((fz0) obj).f10384a);
    }

    public final int hashCode() {
        return this.f10384a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoritesError(message=", this.f10384a, Separators.RPAREN);
    }
}
