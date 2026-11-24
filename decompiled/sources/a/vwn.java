package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vwn implements xwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38160a;

    public vwn(String str) {
        str.getClass();
        this.f38160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwn) && Intrinsics.d(this.f38160a, ((vwn) obj).f38160a);
    }

    public final int hashCode() {
        return this.f38160a.hashCode();
    }

    public final String toString() {
        return kng0.l("StartDestination(value=", this.f38160a, Separators.RPAREN);
    }
}
