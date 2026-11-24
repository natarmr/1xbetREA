package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vap0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37102a;

    public vap0(String str) {
        str.getClass();
        this.f37102a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vap0) && Intrinsics.d(this.f37102a, ((vap0) obj).f37102a);
    }

    public final int hashCode() {
        return this.f37102a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f37102a, Separators.RPAREN);
    }
}
