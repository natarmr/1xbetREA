package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vwa implements wwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38140a;

    public vwa(String str) {
        str.getClass();
        this.f38140a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwa) && Intrinsics.d(this.f38140a, ((vwa) obj).f38140a);
    }

    public final int hashCode() {
        return this.f38140a.hashCode();
    }

    public final String toString() {
        return kng0.l("NoGamesSelected(title=", this.f38140a, Separators.RPAREN);
    }
}
